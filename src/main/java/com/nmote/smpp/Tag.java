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

/**
 * Defines tag constants for TLV optional parameters.
 *
 * @author (this class was autogenerated)
 */
public class Tag {
	/**
	 *
	 * (Type CString)
	 * @since SMPP 34
	 */
	public static final int RECEIPTED_MESSAGE_ID = 0x001E;

	/**
	 *
	 * (Type Integer2)
	 * @since SMPP 50
	 */
	public static final int NUMBER_OF_BROADCASTS = 0x0604;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 50
	 */
	public static final int CONGESTION_STATE = 0x0428;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int LANGUAGE_INDICATOR = 0x020D;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 34
	 */
	public static final int DEST_SUBADDRESS = 0x0203;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int SC_INTERFACE_VERSION = 0x0210;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 34
	 */
	public static final int SOURCE_SUBADDRESS = 0x0202;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int ALERT_ON_MSG_DELIVERY = 0x130C;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 50
	 */
	public static final int BROADCAST_SERVICE_GROUP = 0x060A;

	/**
	 *
	 * (Type String)
	 * @since SMPP 34
	 */
	public static final int CALLBACK_NUM_ATAG = 0x0303;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 50
	 */
	public static final int BROADCAST_CATEGORY_SPECIFIC_INFO = 0x0602;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 34
	 */
	public static final int NETWORK_ERROR_CODE = 0x0423;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int ITS_REPLY_TYPE = 0x1380;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int MS_AVAILABILITY_STATUS = 0x0422;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int PAYLOAD_TYPE = 0x0019;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 34
	 */
	public static final int MESSAGE_PAYLOAD = 0x0424;

	/**
	 *
	 * (Type Integer2)
	 * @since SMPP 34
	 */
	public static final int SMS_SIGNAL = 0x1203;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 50
	 */
	public static final int SOURCE_NODE_ID = 0x060F;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 34
	 */
	public static final int MS_VALIDITY = 0x1204;

	/**
	 *
	 * (Type Integer2)
	 * @since SMPP 34
	 */
	public static final int USER_MESSAGE_REFERENCE = 0x0204;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int SET_DPF = 0x0421;

	/**
	 *
	 * (Type String)
	 * @since SMPP 34
	 */
	public static final int CALLBACK_NUM = 0x0381;

	/**
	 *
	 * (Type Integer4)
	 * @since SMPP 50
	 */
	public static final int DEST_ADDR_NP_COUNTRY = 0x0613;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 50
	 */
	public static final int BROADCAST_AREA_IDENTIFIER = 0x0606;

	/**
	 *
	 * (Type SMPPTime)
	 * @since SMPP 50
	 */
	public static final int BROADCAST_END_TIME = 0x0609;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 50
	 */
	public static final int BILLING_IDENTIFICATION = 0x060B;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 50
	 */
	public static final int DEST_ADDR_NP_RESOLUTION = 0x0611;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int DPF_RESULT = 0x0420;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int MORE_MESSAGES_TO_SEND = 0x0426;

	/**
	 *
	 * (Type Integer4)
	 * @since SMPP 50
	 */
	public static final int BROADCAST_ERROR_STATUS = 0x0607;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int DEST_BEARER_TYPE = 0x0007;

	/**
	 *
	 * (Type Integer4)
	 * @since SMPP 34
	 */
	public static final int QOS_TIME_TO_LIVE = 0x0017;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 50
	 */
	public static final int BROADCAST_CONTENT_TYPE = 0x0601;

	/**
	 *
	 * (Type Integer2)
	 * @since SMPP 34
	 */
	public static final int SAR_MSG_REF_NUM = 0x020C;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 50
	 */
	public static final int BROADCAST_MESSAGE_CLASS = 0x0603;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int SAR_SEGMENT_SEQNUM = 0x020F;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int USSD_SERVICE_OP = 0x0510;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int USER_RESPONSE_CODE = 0x0205;

	/**
	 * The message_state value is returned by the MC to the ESME as part of the query_sm_resp PDU.
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int MESSAGE_STATE = 0x0427;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int DEST_NETWORK_TYPE = 0x0006;

	/**
	 *
	 * (Type Integer2)
	 * @since SMPP 34
	 */
	public static final int DESTINATION_PORT = 0x020B;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int NUMBER_OF_MESSAGES = 0x0304;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 50
	 */
	public static final int SOURCE_NETWORK_ID = 0x060D;

	/**
	 *
	 * (Type String)
	 * @since SMPP 34
	 */
	public static final int ADDITIONAL_STATUS_INFO_TEXT = 0x001D;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int SOURCE_BEARER_TYPE = 0x000F;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int DELIVERY_FAILURE_REASON = 0x0425;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int DEST_TELEMATICS_ID = 0x0008;

	/**
	 *
	 * (Type Integer4)
	 * @since SMPP 50
	 */
	public static final int BROADCAST_CHANNEL_INDICATOR = 0x0600;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int DEST_ADDR_SUBUNIT = 0x0005;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int MS_MSG_WAIT_FACILITIES = 0x0030;

	/**
	 *
	 * (Type Integer2)
	 * @since SMPP 34
	 */
	public static final int SOURCE_PORT = 0x020A;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int PRIVACY_INDICATOR = 0x0201;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 50
	 */
	public static final int DEST_NETWORK_ID = 0x060E;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 50
	 */
	public static final int DEST_ADDR_NP_INFORMATION = 0x0612;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int SOURCE_TELEMATICS_ID = 0x0010;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int CALLBACK_NUM_PRES_IND = 0x0302;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 50
	 */
	public static final int DEST_NODE_ID = 0x0610;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int DISPLAY_TIME = 0x1201;

	/**
	 *
	 * (Type Integer4)
	 * @since SMPP 50
	 */
	public static final int BROADCAST_AREA_SUCCESS = 0x0608;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int SOURCE_ADDR_SUBUNIT = 0x000D;

	/**
	 *
	 * (Type Integer2)
	 * @since SMPP 34
	 */
	public static final int ITS_SESSION_INFO = 0x1383;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int SAR_TOTAL_SEGMENTS = 0x020E;

	/**
	 *
	 * (Type OctetString)
	 * @since SMPP 50
	 */
	public static final int BROADCAST_FREQUENCY_INTERVAL = 0x0605;

	/**
	 *
	 * (Type Integer1)
	 * @since SMPP 34
	 */
	public static final int SOURCE_NETWORK_TYPE = 0x000E;

	public static String toString(int tag) {
		String result;
		switch (tag) {
			case RECEIPTED_MESSAGE_ID: result = "receipted_message_id"; break;
			case NUMBER_OF_BROADCASTS: result = "number_of_broadcasts"; break;
			case CONGESTION_STATE: result = "congestion_state"; break;
			case LANGUAGE_INDICATOR: result = "language_indicator"; break;
			case DEST_SUBADDRESS: result = "dest_subaddress"; break;
			case SC_INTERFACE_VERSION: result = "sc_interface_version"; break;
			case SOURCE_SUBADDRESS: result = "source_subaddress"; break;
			case ALERT_ON_MSG_DELIVERY: result = "alert_on_msg_delivery"; break;
			case BROADCAST_SERVICE_GROUP: result = "broadcast_service_group"; break;
			case CALLBACK_NUM_ATAG: result = "callback_num_atag"; break;
			case BROADCAST_CATEGORY_SPECIFIC_INFO: result = "broadcast_category_specific_info"; break;
			case NETWORK_ERROR_CODE: result = "network_error_code"; break;
			case ITS_REPLY_TYPE: result = "its_reply_type"; break;
			case MS_AVAILABILITY_STATUS: result = "ms_availability_status"; break;
			case PAYLOAD_TYPE: result = "payload_type"; break;
			case MESSAGE_PAYLOAD: result = "message_payload"; break;
			case SMS_SIGNAL: result = "sms_signal"; break;
			case SOURCE_NODE_ID: result = "source_node_id"; break;
			case MS_VALIDITY: result = "ms_validity"; break;
			case USER_MESSAGE_REFERENCE: result = "user_message_reference"; break;
			case SET_DPF: result = "set_dpf"; break;
			case CALLBACK_NUM: result = "callback_num"; break;
			case DEST_ADDR_NP_COUNTRY: result = "dest_addr_np_country"; break;
			case BROADCAST_AREA_IDENTIFIER: result = "broadcast_area_identifier"; break;
			case BROADCAST_END_TIME: result = "broadcast_end_time"; break;
			case BILLING_IDENTIFICATION: result = "billing_identification"; break;
			case DEST_ADDR_NP_RESOLUTION: result = "dest_addr_np_resolution"; break;
			case DPF_RESULT: result = "dpf_result"; break;
			case MORE_MESSAGES_TO_SEND: result = "more_messages_to_send"; break;
			case BROADCAST_ERROR_STATUS: result = "broadcast_error_status"; break;
			case DEST_BEARER_TYPE: result = "dest_bearer_type"; break;
			case QOS_TIME_TO_LIVE: result = "qos_time_to_live"; break;
			case BROADCAST_CONTENT_TYPE: result = "broadcast_content_type"; break;
			case SAR_MSG_REF_NUM: result = "sar_msg_ref_num"; break;
			case BROADCAST_MESSAGE_CLASS: result = "broadcast_message_class"; break;
			case SAR_SEGMENT_SEQNUM: result = "sar_segment_seqnum"; break;
			case USSD_SERVICE_OP: result = "ussd_service_op"; break;
			case USER_RESPONSE_CODE: result = "user_response_code"; break;
			case MESSAGE_STATE: result = "message_state"; break;
			case DEST_NETWORK_TYPE: result = "dest_network_type"; break;
			case DESTINATION_PORT: result = "destination_port"; break;
			case NUMBER_OF_MESSAGES: result = "number_of_messages"; break;
			case SOURCE_NETWORK_ID: result = "source_network_id"; break;
			case ADDITIONAL_STATUS_INFO_TEXT: result = "additional_status_info_text"; break;
			case SOURCE_BEARER_TYPE: result = "source_bearer_type"; break;
			case DELIVERY_FAILURE_REASON: result = "delivery_failure_reason"; break;
			case DEST_TELEMATICS_ID: result = "dest_telematics_id"; break;
			case BROADCAST_CHANNEL_INDICATOR: result = "broadcast_channel_indicator"; break;
			case DEST_ADDR_SUBUNIT: result = "dest_addr_subunit"; break;
			case MS_MSG_WAIT_FACILITIES: result = "ms_msg_wait_facilities"; break;
			case SOURCE_PORT: result = "source_port"; break;
			case PRIVACY_INDICATOR: result = "privacy_indicator"; break;
			case DEST_NETWORK_ID: result = "dest_network_id"; break;
			case DEST_ADDR_NP_INFORMATION: result = "dest_addr_np_information"; break;
			case SOURCE_TELEMATICS_ID: result = "source_telematics_id"; break;
			case CALLBACK_NUM_PRES_IND: result = "callback_num_pres_ind"; break;
			case DEST_NODE_ID: result = "dest_node_id"; break;
			case DISPLAY_TIME: result = "display_time"; break;
			case BROADCAST_AREA_SUCCESS: result = "broadcast_area_success"; break;
			case SOURCE_ADDR_SUBUNIT: result = "source_addr_subunit"; break;
			case ITS_SESSION_INFO: result = "its_session_info"; break;
			case SAR_TOTAL_SEGMENTS: result = "sar_total_segments"; break;
			case BROADCAST_FREQUENCY_INTERVAL: result = "broadcast_frequency_interval"; break;
			case SOURCE_NETWORK_TYPE: result = "source_network_type"; break;
			default: result = "unknown(" + Integer.toHexString(tag) + ")";
		}
		return result;
	}

	/**
	 * Returns SMPP protocol version when this tag
	 * has first appeared.
	 *
	 * @param tag SMPP tag
	 *
	 * @return SMPP protocol version
	 */
	public static int since(int tag) {
		int result;
		switch (tag) {
			case RECEIPTED_MESSAGE_ID: result = 0x34; break;
			case NUMBER_OF_BROADCASTS: result = 0x50; break;
			case CONGESTION_STATE: result = 0x50; break;
			case LANGUAGE_INDICATOR: result = 0x34; break;
			case DEST_SUBADDRESS: result = 0x34; break;
			case SC_INTERFACE_VERSION: result = 0x34; break;
			case SOURCE_SUBADDRESS: result = 0x34; break;
			case ALERT_ON_MSG_DELIVERY: result = 0x34; break;
			case BROADCAST_SERVICE_GROUP: result = 0x50; break;
			case CALLBACK_NUM_ATAG: result = 0x34; break;
			case BROADCAST_CATEGORY_SPECIFIC_INFO: result = 0x50; break;
			case NETWORK_ERROR_CODE: result = 0x34; break;
			case ITS_REPLY_TYPE: result = 0x34; break;
			case MS_AVAILABILITY_STATUS: result = 0x34; break;
			case PAYLOAD_TYPE: result = 0x34; break;
			case MESSAGE_PAYLOAD: result = 0x34; break;
			case SMS_SIGNAL: result = 0x34; break;
			case SOURCE_NODE_ID: result = 0x50; break;
			case MS_VALIDITY: result = 0x34; break;
			case USER_MESSAGE_REFERENCE: result = 0x34; break;
			case SET_DPF: result = 0x34; break;
			case CALLBACK_NUM: result = 0x34; break;
			case DEST_ADDR_NP_COUNTRY: result = 0x50; break;
			case BROADCAST_AREA_IDENTIFIER: result = 0x50; break;
			case BROADCAST_END_TIME: result = 0x50; break;
			case BILLING_IDENTIFICATION: result = 0x50; break;
			case DEST_ADDR_NP_RESOLUTION: result = 0x50; break;
			case DPF_RESULT: result = 0x34; break;
			case MORE_MESSAGES_TO_SEND: result = 0x34; break;
			case BROADCAST_ERROR_STATUS: result = 0x50; break;
			case DEST_BEARER_TYPE: result = 0x34; break;
			case QOS_TIME_TO_LIVE: result = 0x34; break;
			case BROADCAST_CONTENT_TYPE: result = 0x50; break;
			case SAR_MSG_REF_NUM: result = 0x34; break;
			case BROADCAST_MESSAGE_CLASS: result = 0x50; break;
			case SAR_SEGMENT_SEQNUM: result = 0x34; break;
			case USSD_SERVICE_OP: result = 0x34; break;
			case USER_RESPONSE_CODE: result = 0x34; break;
			case MESSAGE_STATE: result = 0x34; break;
			case DEST_NETWORK_TYPE: result = 0x34; break;
			case DESTINATION_PORT: result = 0x34; break;
			case NUMBER_OF_MESSAGES: result = 0x34; break;
			case SOURCE_NETWORK_ID: result = 0x50; break;
			case ADDITIONAL_STATUS_INFO_TEXT: result = 0x34; break;
			case SOURCE_BEARER_TYPE: result = 0x34; break;
			case DELIVERY_FAILURE_REASON: result = 0x34; break;
			case DEST_TELEMATICS_ID: result = 0x34; break;
			case BROADCAST_CHANNEL_INDICATOR: result = 0x50; break;
			case DEST_ADDR_SUBUNIT: result = 0x34; break;
			case MS_MSG_WAIT_FACILITIES: result = 0x34; break;
			case SOURCE_PORT: result = 0x34; break;
			case PRIVACY_INDICATOR: result = 0x34; break;
			case DEST_NETWORK_ID: result = 0x50; break;
			case DEST_ADDR_NP_INFORMATION: result = 0x50; break;
			case SOURCE_TELEMATICS_ID: result = 0x34; break;
			case CALLBACK_NUM_PRES_IND: result = 0x34; break;
			case DEST_NODE_ID: result = 0x50; break;
			case DISPLAY_TIME: result = 0x34; break;
			case BROADCAST_AREA_SUCCESS: result = 0x50; break;
			case SOURCE_ADDR_SUBUNIT: result = 0x34; break;
			case ITS_SESSION_INFO: result = 0x34; break;
			case SAR_TOTAL_SEGMENTS: result = 0x34; break;
			case BROADCAST_FREQUENCY_INTERVAL: result = 0x50; break;
			case SOURCE_NETWORK_TYPE: result = 0x34; break;
			default: result = Integer.MAX_VALUE;
		}
		return result;
	}
}