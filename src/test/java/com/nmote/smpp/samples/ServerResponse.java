/**
 * 
 */
package com.nmote.smpp.samples;

/**
 * @author Tazmeen
 *
 */
public class ServerResponse {
	
	private String status;
	private int code;
	private String message;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
