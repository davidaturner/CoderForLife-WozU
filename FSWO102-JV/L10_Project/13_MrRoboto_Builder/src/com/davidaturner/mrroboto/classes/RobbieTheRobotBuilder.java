package com.davidaturner.mrroboto.classes;

import com.davidaturner.mrroboto.classes.parts.RobbieRobotArm;
import com.davidaturner.mrroboto.classes.parts.RobbieRobotHead;
import com.davidaturner.mrroboto.classes.parts.RobbieRobotLeg;
import com.davidaturner.mrroboto.classes.parts.RobbieRobotTorso;
import com.davidaturner.mrroboto.interfaces.Robot;
import com.davidaturner.mrroboto.interfaces.RobotBuilder;
import com.davidaturner.mrroboto.interfaces.RobotPart;

public class RobbieTheRobotBuilder implements RobotBuilder {

	protected Robot robot = new RobbieTheRobot();
	
	public static String ROBBIE_ROBOT_AARM = "aarm";
	public static String ROBBIE_ROBOT_BARM = "barm";
	public static String ROBBIE_ROBOT_ALEG = "aleg";
	public static String ROBBIE_ROBOT_BLEG = "bleg";
	public static String ROBBIE_ROBOT_TORSO = "torso";
	public static String ROBBIE_ROBOT_HEAD = "head";
	
	@Override
	public void build() {	
		
		buildRobotAarm(); 
		buildRobotBarm(); 
		
		buildRobotAleg(); 
		buildRobotBleg(); 
		
		buildRobotTorso(); 
		
		buildRobotHead(); 
	}
	
	public void buildRobotAarm() {
		((RobbieTheRobot)robot).setaArm( new RobbieRobotArm());
	}
	public void buildRobotBarm() {
		((RobbieTheRobot)robot).setbArm( new RobbieRobotArm());
	}
	public void buildRobotAleg() {
		((RobbieTheRobot)robot).setaLeg( new RobbieRobotLeg());
	}
	public void buildRobotBleg() {
		((RobbieTheRobot)robot).setbLeg( new RobbieRobotLeg());
	}	
	public void buildRobotTorso() {
		((RobbieTheRobot)robot).setTorso( new RobbieRobotTorso());
	}	
	public void buildRobotHead() {
		((RobbieTheRobot)robot).setHead( new RobbieRobotHead());
	}
	
	@Override
	public void repair(String part) {

		if (part.equals(ROBBIE_ROBOT_AARM)) {
			buildRobotAarm();
		} else if (part.equals(ROBBIE_ROBOT_BARM)) {
			buildRobotBarm();
		} else if (part.equals(ROBBIE_ROBOT_ALEG)) {
			buildRobotAleg();
		} else if (part.equals(ROBBIE_ROBOT_BLEG)) {
			buildRobotBleg();
		} else if (part.equals(ROBBIE_ROBOT_TORSO)) {
			buildRobotTorso();
		} else if (part.equals(ROBBIE_ROBOT_HEAD)) {
			buildRobotHead();
		} else {
			System.out.println(part + ": part unknown.");
		}
	}
	
	// Getters and Setters
	@Override
	public Robot getRobot() {
		return robot;
	}

	@Override
	public void setRobot(Robot robot) {
		this.robot = robot;
	}

}
