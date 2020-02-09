package com.davidaturner.mrroboto.interfaces;

import java.util.List;

public abstract class Robot {
	
	public void on() {
	}
	public boolean isOn() {
		return true;
	}
	public void off() {		
	}
	public void reset() {
	}
	
	abstract public List<String> testAllParts();

}
