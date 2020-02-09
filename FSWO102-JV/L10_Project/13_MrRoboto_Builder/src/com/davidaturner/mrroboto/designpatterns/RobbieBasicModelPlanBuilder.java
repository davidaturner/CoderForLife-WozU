package com.davidaturner.mrroboto.designpatterns;

import com.davidaturner.mrroboto.classes.RobbieRobot;
import com.davidaturner.mrroboto.classes.parts.RobbieRobotArms;
import com.davidaturner.mrroboto.classes.parts.RobbieRobotHead;
import com.davidaturner.mrroboto.classes.parts.RobbieRobotLegs;
import com.davidaturner.mrroboto.classes.parts.RobbieRobotTorso;
import com.davidaturner.mrroboto.interfaces.HumanoidRobotPlanBuilder;
import com.davidaturner.mrroboto.interfaces.Robot;
import com.davidaturner.mrroboto.interfaces.RobotPart;

public class RobbieBasicModelPlanBuilder implements HumanoidRobotPlanBuilder {

	private RobbieRobot robot;
	
	public RobbieBasicModelPlanBuilder() {
		robot = new RobbieRobot();
	}
	
	public Robot getRobot() {
		return robot;
	}

	public void setRobot(RobbieRobot robot) {
		this.robot = robot;
	}

	@Override
	public void buildRobotArms() {
		robot.setArms(new RobbieRobotArms());

	}

	@Override
	public void buildRobotLegs() {
		robot.setLegs(new RobbieRobotLegs());

	}

	@Override
	public void buildRobotHead() {
		robot.setHead(new RobbieRobotHead());

	}

	@Override
	public void buildRobotTorso() {
		robot.setTorso(new RobbieRobotTorso());

	}
}
