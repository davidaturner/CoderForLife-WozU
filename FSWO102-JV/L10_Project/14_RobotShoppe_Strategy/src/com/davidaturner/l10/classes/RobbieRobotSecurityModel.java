package com.davidaturner.l10.classes;

import com.davidaturner.l10.designpatterns.CanSpeak;

public class RobbieRobotSecurityModel extends RobbieRobot {

	public RobbieRobotSecurityModel() {
		this.speakBehavior = new CanSpeak();
	}

}
