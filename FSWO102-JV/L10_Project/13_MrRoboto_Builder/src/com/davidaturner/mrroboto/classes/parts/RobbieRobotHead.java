package com.davidaturner.mrroboto.classes.parts;

import com.davidaturner.mrroboto.interfaces.RobotPart;

public class RobbieRobotHead implements RobotPart {

	@Override
	public void test() {
		System.out.println("Robbie Robot Head... Tested. E000");
		
	}

	@Override
	public void reset() {
		System.out.println("Robbie Robot Head... Ready.");
		
	}

	@Override
	public void activate() {
		System.out.println("Robbie Robot Head... Started.");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Robbie Robot Head... Stopped.");
		
	}

	@Override
	public void disengage() {
		System.out.println("Robbie Robot Head... Disengaged.");
		
	}

	@Override
	public String describe() {
		return "RTRRH001 Robot Head" ;
	}

}
