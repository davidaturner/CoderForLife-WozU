package com.davidaturner.mrroboto.interfaces;

public interface RobotPart {

	void test();
	
	void reset();
	void activate();
	void shutdown();
	void disengage();
	
	String describe();
}
