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
 * Authentication PDU used by a transmitter ESME to bind to
the Message Centre. The PDU contains identification
information and an access password for the ESME.
 *
 * @author (this class was autogenerated)
 */
public class BindTransmitterPDU extends AbstractPDU {

    private static final long serialVersionUID = About.SERIAL_VERSION_UID;

    /**
     * Creates a new PDU object.
     */
    public BindTransmitterPDU() {
    }

    /**
     * Returns Command ID for this PDU.
     *
     * @return PDU.BIND_TRANSMITTER;
     */
    public int getCommandId() {
        return PDU.BIND_TRANSMITTER;
    }

    /**
     * Reads mandatory and optional parameters from SMPPInputStream.
     *
     * @param in SMPPInputStream for reading parameters.
     * @throws IOException In case of a problem while reading data.
     */
    void readParameters(SMPPInputStream in) throws IOException {
		// Mandatory parameters
		system_id = in.readCString();
		password = in.readCString();
		system_type = in.readCString();
		interface_version = in.readInteger1();
		address_range = in.readSMPPAddress();

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
		out.writeCString(system_id);
		out.writeCString(password);
		out.writeCString(system_type);
		out.writeInteger1(interface_version);
		out.writeSMPPAddress(address_range);

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
		BindTransmitterRespPDU response = new BindTransmitterRespPDU();
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
    	return "bind_transmitter";
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
        b.append("system_id", toStringHelper(system_id));
        b.append("password", toStringHelper(password));
        b.append("system_type", toStringHelper(system_type));
        b.append("interface_version", toStringHelper(interface_version));
        b.append("address_range", toStringHelper(address_range));

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
        b.append(system_id);
        b.append(password);
        b.append(system_type);
        b.append(interface_version);
        b.append(address_range);

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
    	if (o instanceof BindTransmitterPDU) {
    		BindTransmitterPDU p = (BindTransmitterPDU) o;
    		EqualsBuilder b = new EqualsBuilder();
	    	b.append(p.getSequence(), getSequence());
    		b.append(p.getStatus(), getStatus());

	        // Appending mandatory parameters
    	    b.append(p.system_id, system_id);
    	    b.append(p.password, password);
    	    b.append(p.system_type, system_type);
    	    b.append(p.interface_version, interface_version);
    	    b.append(p.address_range, address_range);

	        // Appending optional parameters
        	b.append(p.getParameters(), getParameters());

        	result = b.isEquals();
        } else {
        	result = false;
        }

        return result;
    }

    // Mandatory parameters

    private String system_id;

    /**
     * Getter for a mandatory parameter system_id.
     * 
     * @return parameter value
     */
    public String getSystemId() {
		return system_id;
    }

    /**
     * Setter for a mandatory parameter system_id.
     * 
     * @param value New parameter value.
     */
    public void setSystemId(String value) {
		system_id = value;
    }

    private String password;

    /**
     * Getter for a mandatory parameter password.
     * 
     * @return parameter value
     */
    public String getPassword() {
		return password;
    }

    /**
     * Setter for a mandatory parameter password.
     * 
     * @param value New parameter value.
     */
    public void setPassword(String value) {
		password = value;
    }

    private String system_type;

    /**
     * Getter for a mandatory parameter system_type.
     * 
     * @return parameter value
     */
    public String getSystemType() {
		return system_type;
    }

    /**
     * Setter for a mandatory parameter system_type.
     * 
     * @param value New parameter value.
     */
    public void setSystemType(String value) {
		system_type = value;
    }

    private int interface_version;

    /**
     * Getter for a mandatory parameter interface_version.
     * This parameter is used to indicate the version of the SMPP protocol.
     * @return parameter value
     */
    public int getInterfaceVersion() {
		return interface_version;
    }

    /**
     * Setter for a mandatory parameter interface_version.
     * This parameter is used to indicate the version of the SMPP protocol.
     * @param value New parameter value.
     */
    public void setInterfaceVersion(int value) {
		interface_version = value;
    }

    private SMPPAddress address_range;

    /**
     * Getter for a mandatory parameter address_range.
     * 
     * @return parameter value
     */
    public SMPPAddress getAddressRange() {
		return address_range;
    }

    /**
     * Setter for a mandatory parameter address_range.
     * 
     * @param value New parameter value.
     */
    public void setAddressRange(SMPPAddress value) {
		address_range = value;
    }
}