package com.capgemini.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message")       //to treat class as table
public class Message {

	@Id                      //denoting the primary key of the table
	@GeneratedValue(strategy = GenerationType.AUTO)           //tells how to generate primary key
	private long id;   
	
	@Column(name = "message_text",length = 20,nullable = false)   //to give the column name as "message_text" instead of text
	private String text;
	public Message() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
