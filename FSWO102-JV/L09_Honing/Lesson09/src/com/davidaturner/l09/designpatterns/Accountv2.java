package com.davidaturner.l09.designpatterns;

import java.util.ArrayList;
import java.util.List;

import com.davidaturner.l09.classes.Address;
import com.davidaturner.l09.classes.Name;

public class Accountv2 {

	protected int id;
	protected String number;
	
	protected Name name;
	
	protected Address address;
	
	protected String contact;
	
	protected List<String>phones;

	private Accountv2( Accountv2Builder builder) {
		this.id = builder.id;
		this.number = builder.number;
		this.name = builder.name;
		this.address = builder.address;
		this.contact = builder.contact;
		this.phones = builder.phones;		
	}
	public int getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public Name getName() {
		return name;
	}
	public String getFullName() {
		return (name != null)? name.getFullName() : null;
	}
	public String getFirstName() {
		return (name != null)? name.getFirstName() : null;
	}
	public String getLastName() {
		return (name != null)? name.getLastName() : null;
	}
	
	public Address getAddress() {
		return address;
	}
	public String getCity() {
		return (address != null)? address.getCity() : null;
	}
	public String getState() {
		return (address != null)? address.getState() : null;
	}
	public String getZip() {
		return (address != null)? address.getZip() : null;
	}
	
	public String getContact() {
		return contact;
	}

	public List<String> getPhones() {
		return phones;
	}
	
	public static class Accountv2Builder {
		private int id;
		private String number;
		
		private Name name;
		
		private Address address;
		
		private String contact;
		
		private List<String>phones;	
		
		public Accountv2Builder(int id, String number) {
			this.id = id;
			this.number = number;
		}
		
		public Accountv2Builder setName(String firstName, String lastName) {
			this.name = new Name();
			this.name.setFirstName(firstName);
			this.name.setLastName(lastName);
			return this;
		}
		public Accountv2Builder setFirstName(String firstName) {
			if (name == null) {
				name = new Name();
			}
			this.name.setFirstName(firstName);
			return this;
		}
		public Accountv2Builder setLastName(String lastName) {
			if (name == null) {
				name = new Name();
			}
			this.name.setLastName(lastName);
			return this;
		}

		
		public Accountv2Builder setAddress(String city, String state, String zip) {
			this.address = new Address();
			this.address.setCity(city);
			this.address.setState(state);
			this.address.setZip(zip);
			return this;
		}
		public Accountv2Builder setCity(String city) {
			if (address == null) {
				address = new Address();
			}
			this.address.setCity(city);
			return this;
		}
		public Accountv2Builder setState(String state) {
			if (address == null) {
				address = new Address();
			}
			this.address.setState(state);
			return this;
		}
		public Accountv2Builder setZip(String zip) {
			if (address == null) {
				address = new Address();
			}
			this.address.setZip(zip);
			return this;
		}
		
		public Accountv2Builder setContact(String contact) {
			this.contact = contact;
			addPhone(contact);
			return this;
		}
		
		public Accountv2Builder addPhone(String phone) {
			if (phones == null) {
				phones = new ArrayList<>();
			}
			phones.add(phone);
			return this;
		}
		
		public Accountv2 build() {
			return new Accountv2(this);
		}
	}
}
