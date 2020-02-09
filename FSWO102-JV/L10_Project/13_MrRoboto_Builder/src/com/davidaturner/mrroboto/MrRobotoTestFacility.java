package com.davidaturner.mrroboto;

import com.davidaturner.mrroboto.classes.HumanoidRobotEngineer;
import com.davidaturner.mrroboto.classes.RobbieRobot;
import com.davidaturner.mrroboto.designpatterns.RobbieBasicModelPlanBuilder;
import com.davidaturner.mrroboto.interfaces.Robot;

public class MrRobotoTestFacility {

	public static void main(String[] args) {
		System.out.println("Welcome to Mr. Roboto Facility!");
		
		HumanoidRobotEngineer robotEngineer = new HumanoidRobotEngineer( new RobbieBasicModelPlanBuilder());
		Robot robot = robotEngineer.buildRobot();
		runDiagnostics(robot);
		
		System.out.println("\r\n...DONE!");

	}
	
	public static void runDiagnostics(Robot robot) {		
		System.out.println("\r\nRobbie Robot Basic Model: " + robot);
		System.out.println();
		for(String message : robot.testAllParts()) {
			System.out.println(message);
		}

	}

}
