package com.nereuneto.iFumo.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer status;
	private String error;
	private long timeStamp;
	public StandardError(Integer status, String error, long timeStamp) {
		super();
		this.status = status;
		this.error = error;
		this.timeStamp = timeStamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
}
