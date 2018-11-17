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
 * The MC response to a submit_multi PDU. This is similar to
submit_sm_resp PDU. The main difference is that where some
of the specified recipients were either invalid or rejected by
Message Centre, the PDU can specify the list of failed
recipients, appending a specific error code for each one,
indicating the reason the recipient was invalid. Also included
MC message_id that can be used in subsequent operations
query, cancel or replace the contents of an undelivered
message.
 *
 * @author (this class was autogenerated)
 */
public class SubmitMultiRespPDU extends AbstractPDU {

    private static final long serialVersionUID = About.SERIAL_VERSION_UID;

    /**
     * Creates a new PDU object.
     */
    public SubmitMultiRespPDU() {
    }

    /**
     * Returns Command ID for this PDU.
     *
     * @return PDU.SUBMIT_MULTI_RESP;
     */
    public int getCommandId() {
        return PDU.SUBMIT_MULTI_RESP;
    }

    /**
     * Reads mandatory and optional parameters from SMPPInputStream.
     *
     * @param in SMPPInputStream for reading parameters.
     * @throws IOException In case of a problem while reading data.
     */
    void readParameters(SMPPInputStream in) throws IOException {
		// Mandatory parameters
		message_id = in.readCString();
		unsucess_sme = in.readCString();

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
		out.writeCString(message_id);
		out.writeCString(unsucess_sme);

		// Optional parameters
		writeOptionalParameters(out);
    }

    /**
     * @see com.nmote.smpp.AbstractPDU#isRequestPDU()
     */
	public boolean isRequestPDU() {
		return false;
	}

	/**
	 * @see com.nmote.smpp.AbstractPDU#createResponse()
	 */
	public AbstractPDU createResponse() {
		throw new UnsupportedOperationException();
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
    	return "submit_multi_resp";
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
        b.append("message_id", toStringHelper(message_id));
        b.append("unsucess_sme", toStringHelper(unsucess_sme));

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
        b.append(message_id);
        b.append(unsucess_sme);

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
    	if (o instanceof SubmitMultiRespPDU) {
    		SubmitMultiRespPDU p = (SubmitMultiRespPDU) o;
    		EqualsBuilder b = new EqualsBuilder();
	    	b.append(p.getSequence(), getSequence());
    		b.append(p.getStatus(), getStatus());

	        // Appending mandatory parameters
    	    b.append(p.message_id, message_id);
    	    b.append(p.unsucess_sme, unsucess_sme);

	        // Appending optional parameters
        	b.append(p.getParameters(), getParameters());

        	result = b.isEquals();
        } else {
        	result = false;
        }

        return result;
    }

    // Mandatory parameters

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

    private String unsucess_sme;

    /**
     * Getter for a mandatory parameter unsucess_sme.
     * 
     * @return parameter value
     */
    public String getUnsucessSme() {
		return unsucess_sme;
    }

    /**
     * Setter for a mandatory parameter unsucess_sme.
     * 
     * @param value New parameter value.
     */
    public void setUnsucessSme(String value) {
		unsucess_sme = value;
    }
}