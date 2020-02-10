package com.davidaturner.l09.classes;

public class Account {
	
	private int id;
	private Name name;
	private Address address;
	private String phone;
	private String alternate;

	public Account() {
		this(0, null, null, null, null);
	}
	public Account(Name name, String phone) {
		
	}
	public Account(int id, String firstName, String lastName,
						String city, String state, String zip,
						String phone, String alternate) {
		this(id, new Name(firstName, lastName), new Address(city, state, zip), phone, alternate);
	}
	public  Account(int id, Name name, Address address, String phone, String alternate) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.alternate = alternate;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAlternate() {
		return alternate;
	}
	public void setAlternate(String alternate) {
		this.alternate = alternate;
	}
	
	

}
