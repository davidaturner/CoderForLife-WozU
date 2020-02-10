package com.davidaturner.mrroboto.classes;

import com.davidaturner.mrroboto.designpatterns.RobbieVariousModelsPlanBuilder;
import com.davidaturner.mrroboto.interfaces.HumanoidRobotPlanBuilder;
import com.davidaturner.mrroboto.interfaces.Robot;
import com.davidaturner.mrroboto.interfaces.RobotEngineer;

public class RobbieVariousModelsRobotEngineer implements RobotEngineer {

	RobbieVariousModelsPlanBuilder builder;
	
	public RobbieVariousModelsRobotEngineer(HumanoidRobotPlanBuilder builder) {
		this.builder = (RobbieVariousModelsPlanBuilder)builder;
	}
	
	public Robot buildRobot() {
		this.builder.buildRobotArms();
		this.builder.buildRobotLegs();
		this.builder.buildRobotHead();
		this.builder.buildRobotTorso();
		
		return this.builder.getRobot();
		
	}
	
	public Robot buildSecurityRobot() {
		this.builder.buildRobotArmsBlasters();
		this.builder.buildRobotLegs();
		this.builder.buildRobotHead();
		this.builder.buildRobotTorsoArmored();
		
		return this.builder.getRobot();
	}
	
	public Robot buildMilitaryRobot() {
		this.builder.buildRobotArmsBlasters();
		this.builder.buildRobotLegsAllTerrain();
		this.builder.buildRobotHeadTactical();
		this.builder.buildRobotTorsoArmored();
		
		return this.builder.getRobot();
	}

}
