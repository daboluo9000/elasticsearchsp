package com.jl.po;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("book")
public class Book implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long ID;
	private String Name;
	private String Author;
	private Integer Lenght;
	private Integer Favor;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Integer getLenght() {
		return Lenght;
	}
	public void setLenght(Integer lenght) {
		Lenght = lenght;
	}
	public Integer getFavor() {
		return Favor;
	}
	public void setFavor(Integer favor) {
		Favor = favor;
	}
	
	@Override
	public String toString() {
		return "Book [ID=" + ID + ", Name=" + Name + ", Author=" + Author + ", Lenght=" + Lenght + ", Favor=" + Favor
				+ "]";
	}
	
	
}
