package com.davidaturner.mrroboto.classes.parts;

import com.davidaturner.mrroboto.interfaces.RobotPart;

public class RobbieRobotArm implements RobotPart {

	@Override
	public void test() {
		System.out.println("Robbie Robot Arm... Tested. E000");
		
	}

	@Override
	public void reset() {
		System.out.println("Robbie Robot Arm... Ready.");
		
	}

	@Override
	public void activate() {
		System.out.println("Robbie Robot Arm... Started.");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Robbie Robot Arm... Stopped.");
		
	}

	@Override
	public void disengage() {
		System.out.println("Robbie Robot Arm... Disengaged.");
		
	}

	@Override
	public String describe() {
		return "RTRRA001 Robot Arm" ;
	}

}
