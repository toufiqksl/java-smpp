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
 * Deliver_sm is the symmetric opposite to submit_sm and is used by
a MC to deliver a message to a receiver or transceiver ESME.
  
 *
 * @author (this class was autogenerated)
 */
public class DeliverSmPDU extends AbstractPDU {

    private static final long serialVersionUID = About.SERIAL_VERSION_UID;

    /**
     * Creates a new PDU object.
     */
    public DeliverSmPDU() {
    }

    /**
     * Returns Command ID for this PDU.
     *
     * @return PDU.DELIVER_SM;
     */
    public int getCommandId() {
        return PDU.DELIVER_SM;
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
		protocol_id = in.readInteger1();
		priority_flag = in.readInteger1();
		schedule_delivery_time = in.readSMPPTime();
		validity_period = in.readSMPPTime();
		registered_delivery = in.readInteger1();
		replace_if_present_flag = in.readBoolean();
		data_coding = in.readInteger1();
		sm_default_msg_id = in.readInteger1();
		short_message = in.readPString();

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
		out.writeInteger1(protocol_id);
		out.writeInteger1(priority_flag);
		out.writeSMPPTime(schedule_delivery_time);
		out.writeSMPPTime(validity_period);
		out.writeInteger1(registered_delivery);
		out.writeBoolean(replace_if_present_flag);
		out.writeInteger1(data_coding);
		out.writeInteger1(sm_default_msg_id);
		out.writePString(short_message);

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
		DeliverSmRespPDU response = new DeliverSmRespPDU();
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
    	return "deliver_sm";
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
        b.append("protocol_id", toStringHelper(protocol_id));
        b.append("priority_flag", toStringHelper(priority_flag));
        b.append("schedule_delivery_time", toStringHelper(schedule_delivery_time));
        b.append("validity_period", toStringHelper(validity_period));
        b.append("registered_delivery", toStringHelper(registered_delivery));
        b.append("replace_if_present_flag", toStringHelper(replace_if_present_flag));
        b.append("data_coding", toStringHelper(data_coding));
        b.append("sm_default_msg_id", toStringHelper(sm_default_msg_id));
        b.append("short_message", toStringHelper(short_message));

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
        b.append(protocol_id);
        b.append(priority_flag);
        b.append(schedule_delivery_time);
        b.append(validity_period);
        b.append(registered_delivery);
        b.append(replace_if_present_flag);
        b.append(data_coding);
        b.append(sm_default_msg_id);
        b.append(short_message);

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
    	if (o instanceof DeliverSmPDU) {
    		DeliverSmPDU p = (DeliverSmPDU) o;
    		EqualsBuilder b = new EqualsBuilder();
	    	b.append(p.getSequence(), getSequence());
    		b.append(p.getStatus(), getStatus());

	        // Appending mandatory parameters
    	    b.append(p.service_type, service_type);
    	    b.append(p.source_addr, source_addr);
    	    b.append(p.dest_addr, dest_addr);
    	    b.append(p.esm_class, esm_class);
    	    b.append(p.protocol_id, protocol_id);
    	    b.append(p.priority_flag, priority_flag);
    	    b.append(p.schedule_delivery_time, schedule_delivery_time);
    	    b.append(p.validity_period, validity_period);
    	    b.append(p.registered_delivery, registered_delivery);
    	    b.append(p.replace_if_present_flag, replace_if_present_flag);
    	    b.append(p.data_coding, data_coding);
    	    b.append(p.sm_default_msg_id, sm_default_msg_id);
    	    b.append(p.short_message, short_message);

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

    private int protocol_id;

    /**
     * Getter for a mandatory parameter protocol_id.
     * 
     * @return parameter value
     */
    public int getProtocolId() {
		return protocol_id;
    }

    /**
     * Setter for a mandatory parameter protocol_id.
     * 
     * @param value New parameter value.
     */
    public void setProtocolId(int value) {
		protocol_id = value;
    }

    private int priority_flag;

    /**
     * Getter for a mandatory parameter priority_flag.
     * 
     * @return parameter value
     */
    public int getPriorityFlag() {
		return priority_flag;
    }

    /**
     * Setter for a mandatory parameter priority_flag.
     * 
     * @param value New parameter value.
     */
    public void setPriorityFlag(int value) {
		priority_flag = value;
    }

    private SMPPTime schedule_delivery_time;

    /**
     * Getter for a mandatory parameter schedule_delivery_time.
     * 
     * @return parameter value
     */
    public SMPPTime getScheduleDeliveryTime() {
		return schedule_delivery_time;
    }

    /**
     * Setter for a mandatory parameter schedule_delivery_time.
     * 
     * @param value New parameter value.
     */
    public void setScheduleDeliveryTime(SMPPTime value) {
		schedule_delivery_time = value;
    }

    private SMPPTime validity_period;

    /**
     * Getter for a mandatory parameter validity_period.
     * 
     * @return parameter value
     */
    public SMPPTime getValidityPeriod() {
		return validity_period;
    }

    /**
     * Setter for a mandatory parameter validity_period.
     * 
     * @param value New parameter value.
     */
    public void setValidityPeriod(SMPPTime value) {
		validity_period = value;
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

    private boolean replace_if_present_flag;

    /**
     * Getter for a mandatory parameter replace_if_present_flag.
     * 
     * @return parameter value
     */
    public boolean getReplaceIfPresentFlag() {
		return replace_if_present_flag;
    }

    /**
     * Setter for a mandatory parameter replace_if_present_flag.
     * 
     * @param value New parameter value.
     */
    public void setReplaceIfPresentFlag(boolean value) {
		replace_if_present_flag = value;
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

    private int sm_default_msg_id;

    /**
     * Getter for a mandatory parameter sm_default_msg_id.
     * 
     * @return parameter value
     */
    public int getSmDefaultMsgId() {
		return sm_default_msg_id;
    }

    /**
     * Setter for a mandatory parameter sm_default_msg_id.
     * 
     * @param value New parameter value.
     */
    public void setSmDefaultMsgId(int value) {
		sm_default_msg_id = value;
    }

    private byte[] short_message;

    /**
     * Getter for a mandatory parameter short_message.
     * 
     * @return parameter value
     */
    public byte[] getShortMessage() {
		return short_message;
    }

    /**
     * Setter for a mandatory parameter short_message.
     * 
     * @param value New parameter value.
     */
    public void setShortMessage(byte[] value) {
		short_message = value;
    }
}