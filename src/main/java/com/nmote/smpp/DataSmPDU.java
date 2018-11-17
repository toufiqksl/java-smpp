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
 * Data_sm is a streamlined version of the submit_sm operation,
designed for packet-based applications that do not demand
extended functionality normally available in the submit_sm
operation. ESMEs implementing WAP over SMS typically use
this operation.
  
 *
 * @author (this class was autogenerated)
 */
public class DataSmPDU extends AbstractPDU {

    private static final long serialVersionUID = About.SERIAL_VERSION_UID;

    /**
     * Creates a new PDU object.
     */
    public DataSmPDU() {
    }

    /**
     * Returns Command ID for this PDU.
     *
     * @return PDU.DATA_SM;
     */
    public int getCommandId() {
        return PDU.DATA_SM;
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
		source_addr = in.readSMPPAddress();
		dest_addr = in.readSMPPAddress();
		esm_class = in.readInteger1();
		registered_delivery = in.readInteger1();
		data_coding = in.readInteger1();

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
		out.writeSMPPAddress(source_addr);
		out.writeSMPPAddress(dest_addr);
		out.writeInteger1(esm_class);
		out.writeInteger1(registered_delivery);
		out.writeInteger1(data_coding);

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
		DataSmRespPDU response = new DataSmRespPDU();
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
    	return "data_sm";
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
        b.append("source_addr", toStringHelper(source_addr));
        b.append("dest_addr", toStringHelper(dest_addr));
        b.append("esm_class", toStringHelper(esm_class));
        b.append("registered_delivery", toStringHelper(registered_delivery));
        b.append("data_coding", toStringHelper(data_coding));

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
        b.append(source_addr);
        b.append(dest_addr);
        b.append(esm_class);
        b.append(registered_delivery);
        b.append(data_coding);

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
    	if (o instanceof DataSmPDU) {
    		DataSmPDU p = (DataSmPDU) o;
    		EqualsBuilder b = new EqualsBuilder();
	    	b.append(p.getSequence(), getSequence());
    		b.append(p.getStatus(), getStatus());

	        // Appending mandatory parameters
    	    b.append(p.service_type, service_type);
    	    b.append(p.source_addr, source_addr);
    	    b.append(p.dest_addr, dest_addr);
    	    b.append(p.esm_class, esm_class);
    	    b.append(p.registered_delivery, registered_delivery);
    	    b.append(p.data_coding, data_coding);

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

    private int esm_class;

    /**
     * Getter for a mandatory parameter esm_class.
     * The esm_class parameter is used to indicate special message attributes associated with the short message.
     * @return parameter value
     */
    public int getEsmClass() {
		return esm_class;
    }

    /**
     * Setter for a mandatory parameter esm_class.
     * The esm_class parameter is used to indicate special message attributes associated with the short message.
     * @param value New parameter value.
     */
    public void setEsmClass(int value) {
		esm_class = value;
    }

    private int registered_delivery;

    /**
     * Getter for a mandatory parameter registered_delivery.
     * 
     * @return parameter value
     */
    public int getRegisteredDelivery() {
		return registered_delivery;
    }

    /**
     * Setter for a mandatory parameter registered_delivery.
     * 
     * @param value New parameter value.
     */
    public void setRegisteredDelivery(int value) {
		registered_delivery = value;
    }

    private int data_coding;

    /**
     * Getter for a mandatory parameter data_coding.
     * Data coding scheme (see GSM 03.38)
     * @return parameter value
     */
    public int getDataCoding() {
		return data_coding;
    }

    /**
     * Setter for a mandatory parameter data_coding.
     * Data coding scheme (see GSM 03.38)
     * @param value New parameter value.
     */
    public void setDataCoding(int value) {
		data_coding = value;
    }
}