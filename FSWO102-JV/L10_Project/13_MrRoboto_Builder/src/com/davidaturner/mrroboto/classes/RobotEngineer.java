package com.davidaturner.mrroboto.classes;

import com.davidaturner.mrroboto.interfaces.Robot;
import com.davidaturner.mrroboto.interfaces.RobotBuilder;
import com.davidaturner.mrroboto.interfaces.RobotPlan;

public class RobotEngineer implements RobotPlan {

	protected RobotBuilder builder;
	
	public RobotEngineer(RobotBuilder builder) {
		this.builder = builder;
	}

	@Override
	public Robot buildRobot() {
		
		builder.build();	
		return builder.getRobot();
	}

	
	
}
