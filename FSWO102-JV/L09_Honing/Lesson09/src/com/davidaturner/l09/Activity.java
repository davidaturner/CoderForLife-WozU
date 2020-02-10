package com.davidaturner.l09;

import com.davidaturner.l09.classes.Account;
import com.davidaturner.l09.classes.Address;
import com.davidaturner.l09.classes.Name;

public class Activity {

	public static void main(String[] args) {

		println("Hello, World!");
		
		Name name = new Name("David", "Turner");
		Address address = new Address("2891 Laketon Road", "PA", "15235");
		
		Account longAccount = new Account(0, "David", "Turner", "2891 Laketon Road", "PA", "15235", "4122470776", "4128974924");

		println("Name", name.getFirstName() + " " + name.getLastName());
		println("Address", address.getCity() + " " + address.getState() + " " + address.getZip());
		println("Account", longAccount.getId() + " " + longAccount.getName().getFirstName() + " " + 
														longAccount.getName().getLastName());
	}
	
	public static void println() {
		System.out.println();
	}
	public static void println(String message) {
		println(null, message);
	}
	public static void println(String prompt, String message) {
		String toBePrinted = message;
		if (prompt != null && !prompt.isEmpty()) {
			toBePrinted = prompt + ": " + toBePrinted;
		}
		System.out.println(toBePrinted);
	}
}
