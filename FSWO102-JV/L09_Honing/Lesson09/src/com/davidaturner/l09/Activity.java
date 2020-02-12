package com.davidaturner.l09;

import com.davidaturner.l09.classes.Account;
import com.davidaturner.l09.designpatterns.Accountv2;

public class Activity {

	public static void main(String[] args) {

		println("Creating new account...");
		RunAccountTest01();
		println();
		
		println("Creating new accountv2...");		
		RunAccountTest02();
		println("\r\n...DONE!");
	}
	
	// Tests
	public static void RunAccountTest01() {
		
		Account account = new Account(1, "0001", "David", "Turner", "2891 Laketon Road", "PA", "15235", "4122470776", "4128974924");
		println(account.getId() + " " + account.getNumber());
		println(account.getName().getFullName());
		println(account.getCity() + " " + account.getState() + " " + account.getZip());		
	}
	public static void RunAccountTest02() {
		
		Account account = new Account(1, "0001", "David", "Turner", "2891 Laketon Road", "PA", "15235", "4122470776", "4128974924");
		Accountv2 accountv2 = new Accountv2.Accountv2Builder(1, "0001")
									.setName("David",  "Turner")
									.setAddress("2891 Laketon Road", "PA", "15235")
									.setContact("4122470776")
									.addPhone("4128974924")
									.build();
		println(accountv2.getId() + " " + accountv2.getNumber());
		println(accountv2.getFullName());
		println(accountv2.getCity() + " " + accountv2.getState() + " " + accountv2.getZip());		
	}

	//Auxiliary operations.
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
