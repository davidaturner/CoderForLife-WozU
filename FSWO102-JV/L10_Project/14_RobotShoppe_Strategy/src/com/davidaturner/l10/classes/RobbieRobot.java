package com.davidaturner.l10.classes;

import com.davidaturner.l10.designpatterns.behaviors.CanLift;
import com.davidaturner.l10.designpatterns.behaviors.CanLoad;
import com.davidaturner.l10.designpatterns.behaviors.CanMove;
import com.davidaturner.l10.designpatterns.behaviors.CanSpeakFluently;
import com.davidaturner.l10.interfaces.HumanoidRobot;

public class RobbieRobot extends HumanoidRobot {
	
	public RobbieRobot() {
		
		this.armsBehavior = new CanLift();
		this.legsBehavior = new CanMove();
		this.headBehavior = new CanSpeakFluently();
		this.torsoBehavior = new CanLoad();
	}
	
	@Override
	public void test() {
		System.out.println("Hi! I'm Robbie Robot! And I...\r\n");
		lift();
		run();
		speak();
		load();
		
	}

}
