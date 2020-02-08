package com.davidaturner.mrroboto.classes;

import com.davidaturner.mrroboto.classes.parts.RobbieRobotArm;
import com.davidaturner.mrroboto.classes.parts.RobbieRobotHead;
import com.davidaturner.mrroboto.classes.parts.RobbieRobotLeg;
import com.davidaturner.mrroboto.classes.parts.RobbieRobotTorso;
import com.davidaturner.mrroboto.interfaces.Robot;

public class RobbieTheRobot implements Robot {

	protected RobbieRobotArm aArm, bArm;
	protected RobbieRobotLeg aLeg, bLeg;
	protected RobbieRobotTorso torso;
	protected RobbieRobotHead head;
	
	@Override
	public void test() {
		System.out.println("Testing all parts. DONE! E000.");
		
	}
	@Override
	public void activate() {
		System.out.println("Activating all parts. DONE! E000.");
		
	}
	@Override
	public void restart() {
		System.out.println("Restarting all parts. DONE! E000.");
		
	}
	@Override
	public void shutDown() {
		System.out.println("Shutting down all parts.");
		
	}
	@Override
	public void sleep() {
		System.out.println("Going into SLEEP mode.");
		
	}
	
	// Getters and setters
	public RobbieRobotArm getaArm() {
		return aArm;
	}
	public void setaArm(RobbieRobotArm aArm) {
		this.aArm = aArm;
	}
	public RobbieRobotArm getbArm() {
		return bArm;
	}
	public void setbArm(RobbieRobotArm bArm) {
		this.bArm = bArm;
	}
	public RobbieRobotLeg getaLeg() {
		return aLeg;
	}
	public void setaLeg(RobbieRobotLeg aLeg) {
		this.aLeg = aLeg;
	}
	public RobbieRobotLeg getbLeg() {
		return bLeg;
	}
	public void setbLeg(RobbieRobotLeg bLeg) {
		this.bLeg = bLeg;
	}
	public RobbieRobotTorso getTorso() {
		return torso;
	}
	public void setTorso(RobbieRobotTorso torso) {
		this.torso = torso;
	}
	public RobbieRobotHead getHead() {
		return head;
	}
	public void setHead(RobbieRobotHead head) {
		this.head = head;
	}	


}
