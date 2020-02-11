package com.davidaturner.l10.classes;

import com.davidaturner.l10.designpatterns.CanSpeakFluently;
import com.davidaturner.l10.interfaces.HumanoidRobot;
import com.davidaturner.l10.interfaces.SpeakBehavior;

public class RobbieRobot implements HumanoidRobot {

	protected SpeakBehavior speakBehavior;

	public RobbieRobot() {
		this.speakBehavior = new CanSpeakFluently();
	}
	
	@Override
	public void test() {
		System.out.println("Speak: " + getSpeakBehavior().speak());
	}

	@Override
	public SpeakBehavior getSpeakBehavior() {
		return speakBehavior;
	}
	

}
