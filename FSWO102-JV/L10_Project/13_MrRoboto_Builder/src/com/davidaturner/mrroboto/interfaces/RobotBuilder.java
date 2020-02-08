package com.davidaturner.mrroboto.interfaces;

public interface RobotBuilder {

	void build();
	
	void repair(String part);
	
	Robot getRobot();
	void setRobot(Robot robot);
}
