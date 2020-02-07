package com.davidaturner.l07;

import com.davidaturner.l07.classes.Employee;
import com.davidaturner.l07.classes.Engineer;
import com.davidaturner.l07.classes.Manager;

public class HandsOn {

	public static void main(String[] args) {
		
		Employee marthablackmun = new Employee();
		marthablackmun.setFirstName("Martha");
		marthablackmun.setLastName("Blackmun");
		marthablackmun.setCompanyName("MuncieParts, Inc.");
		marthablackmun.setYearsAtCompany(15);
		
		Engineer hedyblackmun = new Engineer(
										"Hedy",
										"Blackmun-Kaplan",
										"MuncieParts, Inc.",
										2, 
										"Lead Engineer");
		
		Manager tobyblackmun = new Manager (
										"Toby",
										"Blackmun",
										"MuncieParts, Inc.",
										10,
										"Manager of R&D");
		
		System.out.println(marthablackmun.toString());
		System.out.println(hedyblackmun.toString());
		System.out.println(tobyblackmun.toString());

	}

}
