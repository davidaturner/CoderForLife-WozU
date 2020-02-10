package com.davidaturner.mrroboto;

import com.davidaturner.mrroboto.classes.RobbieRobot;
import com.davidaturner.mrroboto.designpatterns.HumanoidRobotEngineer;
import com.davidaturner.mrroboto.designpatterns.RobbieVariousModelsPlanBuilder;
import com.davidaturner.mrroboto.designpatterns.RobbieVariousModelsRobotEngineer;
import com.davidaturner.mrroboto.interfaces.Robot;
import com.davidaturner.mrroboto.interfaces.RobotEngineer;

public class MrRobotoTestFacility {

	public static void main(String[] args) {
		System.out.println("Welcome to Mr. Roboto Facility!");
		
//		RobotEngineer robotEngineer = new HumanoidRobotEngineer( new RobbieVariousModelsPlanBuilder());
		RobotEngineer robotEngineer = new RobbieVariousModelsRobotEngineer(
																new RobbieVariousModelsPlanBuilder());
				
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
