/**
 * Package Name - com.nmote.smpp.samples
 *
 * File Name - MessageBean.java	
 *
 * Copyright Notice: This file is the property of Augmedix
 *
 */
package com.nmote.smpp.samples;

import java.util.List;

/**
 * @author Toufiq Mahmud Tushar (toufiq@augmedix.com)
 *
 * Jul 13, 2018
 *
 */
public class ServerRequest {
	
	private String message;
	private String source;
	private List<String> destination;
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the destination
	 */
	public List<String> getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(List<String> destination) {
		this.destination = destination;
	}

	
	
}
