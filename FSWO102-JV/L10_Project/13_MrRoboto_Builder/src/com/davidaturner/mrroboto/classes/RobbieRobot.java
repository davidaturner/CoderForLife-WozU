package com.davidaturner.mrroboto.classes;

import java.util.ArrayList;
import java.util.List;

import com.davidaturner.mrroboto.interfaces.Robot;
import com.davidaturner.mrroboto.interfaces.RobotPart;

public class RobbieRobot extends Robot {

	RobotPart arms;
	RobotPart legs;
	RobotPart head;
	RobotPart torso;
	List<RobotPart>accessories;
	
	@Override
	public List<String> testAllParts() {
		List<String>statusMessages = new ArrayList<>();
		String message;
		
		message = arms.test();
		statusMessages.add(message);
		
		message = legs.test();
		statusMessages.add(message);
		
		message = head.test();
		statusMessages.add(message);
		
		message = torso.test();
		statusMessages.add(message);
		
		return statusMessages;
	}

	public RobotPart getArms() {
		return arms;
	}

	public void setArms(RobotPart arms) {
		this.arms = arms;
	}

	public RobotPart getLegs() {
		return legs;
	}

	public void setLegs(RobotPart legs) {
		this.legs = legs;
	}

	public RobotPart getHead() {
		return head;
	}

	public void setHead(RobotPart head) {
		this.head = head;
	}

	public RobotPart getTorso() {
		return torso;
	}

	public void setTorso(RobotPart torso) {
		this.torso = torso;
	}

	public List<RobotPart> getAccessories() {
		return accessories;
	}

	public void setAccessories(List<RobotPart> accessories) {
		this.accessories = accessories;
	}
	
	public void addAccessory(RobotPart accessory) {
		if (this.accessories == null) {
			this.accessories = new ArrayList<RobotPart>();
		}
		this.accessories.add(accessory);
	}

}
