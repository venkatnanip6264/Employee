package com.example.Employee.Entity;

import org.springframework.http.HttpStatus;

public class errorMessage {
	
	private HttpStatus status; 
	
	private String message;

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public errorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public errorMessage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "errorMessage [status=" + status + ", message=" + message + "]";
	}

}
