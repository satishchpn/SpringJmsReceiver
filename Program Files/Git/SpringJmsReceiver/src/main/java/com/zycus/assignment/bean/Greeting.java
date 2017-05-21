package com.zycus.assignment.bean;

import java.io.Serializable;

public class Greeting implements Serializable {

	private static final long serialVersionUID = 4804016330756150987L;
	private String name;
	private String address;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}



}
