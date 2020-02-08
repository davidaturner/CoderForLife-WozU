package com.davidaturner.mrroboto.classes.parts;

import com.davidaturner.mrroboto.interfaces.RobotPart;

public class RobbieRobotTorso implements RobotPart {

	@Override
	public void test() {
		System.out.println("Robbie Robot Torso... Tested. E000");
		
	}

	@Override
	public void reset() {
		System.out.println("Robbie Robot Torso... Ready.");
		
	}

	@Override
	public void activate() {
		System.out.println("Robbie Robot Torso... Started.");
		
	}

	@Override
	public void shutdown() {
		System.out.println("Robbie Robot Torso... Stopped.");
		
	}

	@Override
	public void disengage() {
		System.out.println("Robbie Robot Torso... Disengaged.");
		
	}

	@Override
	public String describe() {
		return "RTRRT001 Robot Torso" ;
	}

}
