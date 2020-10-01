package com.example.demo.model;

public class Greeting {

	private long counter;
	private String templateWithName;
	
	public Greeting() {
	}
	
	public Greeting(long counter, String templateWithName) {
		this.counter = counter;
		this.templateWithName = templateWithName;
	}
	
	public long getCounter() {
		return counter;
	}
	public void setCounter(long counter) {
		this.counter = counter;
	}
	public String getTemplateWithName() {
		return templateWithName;
	}
	public void setTemplateWithName(String templateWithName) {
		this.templateWithName = templateWithName;
	}
}
