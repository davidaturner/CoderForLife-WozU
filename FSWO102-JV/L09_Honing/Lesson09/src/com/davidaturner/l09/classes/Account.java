package com.davidaturner.l09.classes;

import java.util.ArrayList;
import java.util.List;

public class Account {

	protected int id;
	protected String number;
	
	protected Name name;
	
	protected Address address;
	
	protected String contact;
	
	protected List<String>phones;

	public Account(int id, String number, String firstName, String lastName,
					String city, String state, String zip, String firstPhone, String secondPhone) {
		this.id = id;
		this.number = number;
		
		this.name = new Name();
		this.name.firstName = firstName;
		this.name.lastName = lastName;
		
		this.address = new Address();
		this.address.city = city;
		this.address.state = state;
		this.address.zip = zip;
		
		this.contact = firstPhone;
		
		this.phones = new ArrayList<>();
		this.phones.add(firstPhone);
		this.phones.add(secondPhone);
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Name getName() {
		return name;
	}
	public String getFirstName() {
		return (name != null)?name.firstName : null;
	}
	public String getLastName() {
		return (name != null)?name.lastName : null;
	}

	public void setName(Name name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}
	public String getCity() {
		return (address != null)? address.city : null;
		
	}
	public String getState() {
		return (address != null)? address.state : null;	
	}
	public String getZip() {
		return (address != null)? address.zip : null;	
	}	
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getPhones() {
		return phones;
	}
	public void addPhone(String phone) {
		if (phones != null) {
			phones.add(phone);
		}
	}
	
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
}
