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
	public void makeRobot() {
		
		builder.build();	
	}

	@Override
	public Robot getRobot() {

		return builder.getRobot();
	}
	
	
}
