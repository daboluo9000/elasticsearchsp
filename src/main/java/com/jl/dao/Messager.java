package com.jl.dao;

public class Messager {
	
	public Integer id;
	public String message;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Messager [id=" + id + ", message=" + message + "]";
	}
	
	

}
