package com.davidaturner.mrroboto.classes.parts;

import com.davidaturner.mrroboto.interfaces.RobotPart;

public class RobbieRobotLeg implements RobotPart {

	@Override
	public void test() {
		System.out.println("Robbie Robot Leg... Tested. E000");
		
	}

	@Override
	public void reset() {
		System.out.println("Robbie Robot Leg... Ready.");
		
	}

	@Override
	public void activate() {
		System.out.println("Robbie Robot Leg... Started.");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Robbie Robot Leg... Stopped.");
		
	}

	@Override
	public void disengage() {
		System.out.println("Robbie Robot Leg... Disengaged.");
		
	}

	@Override
	public String describe() {
		return "RTRRL001 Robot Leg" ;
	}

}
