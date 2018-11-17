/*
 * Copyright (c) Nmote d.o.o. 2003. All rights reserved.
 * See LICENSE.txt for licensing information.
 */

package com.nmote.smpp.samples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.nmote.smpp.AbstractPDU;
import com.nmote.smpp.BasicBindingAuthorizer;
import com.nmote.smpp.Command;
import com.nmote.smpp.DispatchProcessor;
import com.nmote.smpp.Link;
import com.nmote.smpp.LinkCreationException;
import com.nmote.smpp.PDU;
import com.nmote.smpp.Processor;
import com.nmote.smpp.SMSCSession;
import com.nmote.smpp.ServerTCPLinkFactory;
import com.nmote.smpp.Session;
import com.nmote.smpp.SubmitSmPDU;
import com.nmote.smpp.SubmitSmRespPDU;
import com.nmote.smpp.util.DCS;

/**
 * This example demonstrates creating server for SMPP communication. Servers are
 * created by creating a link with ServerTCPLinkFactory and starting
 * SMSCSession-s.
 *
 * @author Toufiq Mahmud
 */
public class Server {

	public static void main(String[] args) throws Exception {

		Samples.init();
		final Logger log = LoggerFactory.getLogger(SendMessage.class);

		// Create a server
		String port = getPropValues().getPort();
		System.out.println("Port: " + port);
		System.out.println("Password: " + getPropValues().getPassword());
		System.out.println("SystemID: " + getPropValues().getSystemId());
		System.out.println("SystemType: " + getPropValues().getSystemType());
		ServerTCPLinkFactory server = new ServerTCPLinkFactory(Integer.parseInt(port));
		server.setLog(log);

		// Accept connections
		server.setAccept(true);

		System.out.println("Server Running at Port " + server.getPort());

		openSession(server);
	}

	private static void openSession(ServerTCPLinkFactory server) throws LinkCreationException, IOException {

		final Logger log = LoggerFactory.getLogger(SendMessage.class);
		SMSCSession s;
		Link link = server.createLink();
		// Configure an SMSC session
		s = new SMSCSession(link);
		// Setup access control
		BasicBindingAuthorizer bbc = new BasicBindingAuthorizer();
		bbc.setPassword(getPropValues().getPassword());
		bbc.setSystemId(getPropValues().getSystemId());
		bbc.setSystemType(getPropValues().getSystemType());
		s.setAuthorizer(bbc);

		// Install a processor that processes submit requests
		// Delegate all other commands to a standard session processor
		DispatchProcessor dp = new DispatchProcessor(s.getIncomingProcessor());
		dp.setProcessor(PDU.SUBMIT_SM, new Processor() {
			public void process(Command cmd, Session session) {
				AbstractPDU request = cmd.getRequest();
				if (request.getCommandId() == PDU.SUBMIT_SM) {
					SubmitSmPDU submit = (SubmitSmPDU) request;
					log.info("Received SMS: " + DCS.toUnicode(submit.getShortMessage()));
					log.info("Dest Address: " + submit.getDestAddr().getAddress());
					log.info("Source Address: " + submit.getSourceAddr().getAddress());
					List<String> destIds = new ArrayList<String>(
							Arrays.asList(submit.getDestAddr().getAddress().split(" , ")));
					ServerResponse response = createHttpRequest(DCS.toUnicode(submit.getShortMessage()), destIds,
							submit.getSourceAddr().getAddress());
					SubmitSmRespPDU resp = (SubmitSmRespPDU) request.createResponse();
					resp.setMessageId("msg001");
					resp.setStatus(response.getCode());
					System.out.println("Server Message: " + response.getMessage());
					cmd.respond(resp);
				}
			}
		});
		s.setIncomingProcessor(dp);

		// Open session. PDU processing starts
		s.open();

		if (s.isCloseWhenUnbound()) {
			openSession(server);
		}
	}

	public static ServerResponse createHttpRequest(String message, List<String> destId, String sourceId) {
		ServerResponse response = new ServerResponse();
		try {

			ServerRequest obj = new ServerRequest();
			obj.setMessage(message);
			obj.setSource(sourceId);
			obj.setDestination(destId);

			Gson gson = new Gson();
			String json = gson.toJson(obj);

			System.out.println(">>>>> Request Json Data: " + json);

			URL url = new URL("http://ubiqbd.com/project/sms_gateway/api/sms_gateway");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");

			OutputStream os = conn.getOutputStream();
			os.write(json.getBytes());
			os.flush();

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
				response = generateObjectFromJson(output);
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return response;

	}

	public static ServerResponse generateObjectFromJson(String jsonInString) {

		ObjectMapper mapper = new ObjectMapper();
		ServerResponse response = new ServerResponse();
		try {
			response = mapper.readValue(jsonInString, ServerResponse.class);
			String prettyStaff1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
			System.out.println(prettyStaff1);

		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return response;

	}

	public static ServerProperty getPropValues() throws IOException {
		Properties prop = new Properties();
		InputStream input = null;
		ServerProperty serverProperty = new ServerProperty();

		try {
			input = new FileInputStream("./config.properties");

			// load the properties file
			prop.load(input);
			serverProperty.setPassword(prop.getProperty("server.password"));
			serverProperty.setPort(prop.getProperty("server.port"));
			serverProperty.setSystemId(prop.getProperty("server.systemId"));
			serverProperty.setSystemType(prop.getProperty("server.systemType"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return serverProperty;
	}
}
