package com.davidaturner.l10;

import java.awt.Robot;

import com.davidaturner.l10.classes.RobbieRobot;
import com.davidaturner.l10.classes.RobbieRobotMilitaryGrade;
import com.davidaturner.l10.classes.RobbieRobotSecurityModel;
import com.davidaturner.l10.designpatterns.CanSpeakFluently;
import com.davidaturner.l10.interfaces.HumanoidRobot;

public class RobotTestingFacility {

	public static void main(String[] args) {
		System.out.println("Hello, World!");

		HumanoidRobot robot = new RobbieRobot();
		println("Testing RobbieRobot Basic Model.");
		robot.test();
		println();
		
		robot = new RobbieRobotSecurityModel();
		println("Testing RobbieRobot Security Model.");
		robot.test();
		println();
		
		robot = new RobbieRobotMilitaryGrade();
		println("Testing RobbieRobot Military Grade.");
		robot.test();
		println();
		println("...DONE!");
				
	}
	
	public static void println() {
		System.out.println();
	}
	public static void println(String prompt, String message) {
		if (prompt != null && !prompt.isEmpty()) {
			message = prompt + ": " + message;
		}
		System.out.println(message);
	}
	public static void println(String message) {
		println(null, message);
	}

}
