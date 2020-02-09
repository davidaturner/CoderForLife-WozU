package com.davidaturner.mrroboto.classes;

import com.davidaturner.mrroboto.interfaces.HumanoidRobotPlanBuilder;
import com.davidaturner.mrroboto.interfaces.Robot;
import com.davidaturner.mrroboto.interfaces.RobotEngineer;

public class HumanoidRobotEngineer implements RobotEngineer {

	HumanoidRobotPlanBuilder builder;
	
	public HumanoidRobotEngineer(HumanoidRobotPlanBuilder builder) {
		this.builder = builder;
	}
	
	public Robot buildRobot() {
		this.builder.buildRobotArms();
		this.builder.buildRobotLegs();
		this.builder.buildRobotHead();
		this.builder.buildRobotTorso();
		
		return this.builder.getRobot();
		
	}

}
