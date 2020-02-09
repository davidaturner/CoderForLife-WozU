package com.davidaturner.mrroboto.interfaces;

public interface HumanoidRobotPlanBuilder {

	void buildRobotArms();
	void buildRobotLegs();
	void buildRobotHead();
	void buildRobotTorso();
	
	Robot getRobot();

}
