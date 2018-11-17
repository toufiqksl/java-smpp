/*
 * Copyright (c) Nmote d.o.o. 2003-2015. All rights reserved.
 * See LICENSE.txt for licensing information.
 */

/*
 * WARNING Do not modify this file.
 *
 * This file was generated from protocol description file
 * and will be OVERWRITTEN on next invocation of
 * smpp-gen ant task during build process.
 */

package com.nmote.smpp;

import java.io.IOException;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;

/**
 * This PDU is used to cancel a previously submitted message.
The PDU contains the source address of the original
message and the message_id returned in the original
submit_sm_resp, submit_multi_resp or data_sm_resp PDU.
This PDU may also omit the message_id and instead contain
a source address, destination address and optional
service_type field as a means of cancelling a range of
messages sent from one address to another.
  
 *
 * @author (this class was autogenerated)
 */
public class CancelSmPDU extends AbstractPDU {

    private static final long serialVersionUID = About.SERIAL_VERSION_UID;

    /**
     * Creates a new PDU object.
     */
    public CancelSmPDU() {
    }

    /**
     * Returns Command ID for this PDU.
     *
     * @return PDU.CANCEL_SM;
     */
    public int getCommandId() {
        return PDU.CANCEL_SM;
    }

    /**
     * Reads mandatory and optional parameters from SMPPInputStream.
     *
     * @param in SMPPInputStream for reading parameters.
     * @throws IOException In case of a problem while reading data.
     */
    void readParameters(SMPPInputStream in) throws IOException {
		// Mandatory parameters
		service_type = in.readCString();
		message_id = in.readCString();
		source_addr = in.readSMPPAddress();
		dest_addr = in.readSMPPAddress();

		// Optional parameters
		readOptionalParameters(in);
    }

    /**
     * Write mandatory and optional PDU parameters to SMPPOutputStream.
     *
     * @param out SMPPOutputStream for writting paramters.
     * @throws IOException In case of errors while writing.
     */
    void writeParameters(SMPPOutputStream out) throws IOException {
        // Mandatory parameters
		out.writeCString(service_type);
		out.writeCString(message_id);
		out.writeSMPPAddress(source_addr);
		out.writeSMPPAddress(dest_addr);

		// Optional parameters
		writeOptionalParameters(out);
    }

    /**
     * @see com.nmote.smpp.AbstractPDU#isRequestPDU()
     */
	public boolean isRequestPDU() {
		return true;
	}

	/**
	 * @see com.nmote.smpp.AbstractPDU#createResponse()
	 */
	public AbstractPDU createResponse() {
		CancelSmRespPDU response = new CancelSmRespPDU();
		response.sequence = sequence;
		return response;
	}

	/**
	 * @see com.nmote.smpp.AbstractPDU#isOneWay()
	 */
	public final boolean isOneWay() {
		return false;
	}

    /**
     * Returns PDU name.
     *
     * @return PDU name
     */
    public String getName() {
    	return "cancel_sm";
    }

    /**
     * Creates a string representation of a PDU.
     *
     * @return a String
     */
    public String toString() {
    	ToStringBuilder b = new ToStringBuilder(this);
    	b.append(getSequence());
    	b.append(ESMEStatus.toString(getStatus()));

        // Appending mandatory parameters
        b.append("service_type", toStringHelper(service_type));
        b.append("message_id", toStringHelper(message_id));
        b.append("source_addr", toStringHelper(source_addr));
        b.append("dest_addr", toStringHelper(dest_addr));

        // Appending optional parameters
        if (getParameters() != null) {
        	b.append(getParameters());
        }

        return b.toString();
    }

    /**
     * Calculates hash code of this object.
     *
     * @return hash code
     */
    public int hashCode() {
    	HashCodeBuilder b = new HashCodeBuilder();
    	b.append(getSequence());
    	b.append(getStatus());

        // Appending mandatory parameters
        b.append(service_type);
        b.append(message_id);
        b.append(source_addr);
        b.append(dest_addr);

        // Appending optional parameters
        if (getParameters() != null) {
        	b.append(getParameters());
        }

        return b.toHashCode();
    }

    /**
     * Checks if <code>o</code> and this object are equal.
     *
     * @return true if objects are equal, false otherwise
     */
    public boolean equals(Object o) {
    	boolean result;
    	if (o instanceof CancelSmPDU) {
    		CancelSmPDU p = (CancelSmPDU) o;
    		EqualsBuilder b = new EqualsBuilder();
	    	b.append(p.getSequence(), getSequence());
    		b.append(p.getStatus(), getStatus());

	        // Appending mandatory parameters
    	    b.append(p.service_type, service_type);
    	    b.append(p.message_id, message_id);
    	    b.append(p.source_addr, source_addr);
    	    b.append(p.dest_addr, dest_addr);

	        // Appending optional parameters
        	b.append(p.getParameters(), getParameters());

        	result = b.isEquals();
        } else {
        	result = false;
        }

        return result;
    }

    // Mandatory parameters

    private String service_type;

    /**
     * Getter for a mandatory parameter service_type.
     * 
     * @return parameter value
     */
    public String getServiceType() {
		return service_type;
    }

    /**
     * Setter for a mandatory parameter service_type.
     * 
     * @param value New parameter value.
     */
    public void setServiceType(String value) {
		service_type = value;
    }

    private String message_id;

    /**
     * Getter for a mandatory parameter message_id.
     * The unique message identifier reference assigned by the MC to each submitted short message. It is an opaque value and is set according to MC implementation.
     * @return parameter value
     */
    public String getMessageId() {
		return message_id;
    }

    /**
     * Setter for a mandatory parameter message_id.
     * The unique message identifier reference assigned by the MC to each submitted short message. It is an opaque value and is set according to MC implementation.
     * @param value New parameter value.
     */
    public void setMessageId(String value) {
		message_id = value;
    }

    private SMPPAddress source_addr;

    /**
     * Getter for a mandatory parameter source_addr.
     * 
     * @return parameter value
     */
    public SMPPAddress getSourceAddr() {
		return source_addr;
    }

    /**
     * Setter for a mandatory parameter source_addr.
     * 
     * @param value New parameter value.
     */
    public void setSourceAddr(SMPPAddress value) {
		source_addr = value;
    }

    private SMPPAddress dest_addr;

    /**
     * Getter for a mandatory parameter dest_addr.
     * Specifies the destination SME address. For mobile terminated messages, this is the directory number of the recipient MS.
     * @return parameter value
     */
    public SMPPAddress getDestAddr() {
		return dest_addr;
    }

    /**
     * Setter for a mandatory parameter dest_addr.
     * Specifies the destination SME address. For mobile terminated messages, this is the directory number of the recipient MS.
     * @param value New parameter value.
     */
    public void setDestAddr(SMPPAddress value) {
		dest_addr = value;
    }
}