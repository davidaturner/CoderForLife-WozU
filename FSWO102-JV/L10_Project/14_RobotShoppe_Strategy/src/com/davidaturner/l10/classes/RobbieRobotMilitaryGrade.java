package com.davidaturner.l10.classes;

import com.davidaturner.l10.designpatterns.CannotSpeak;

public class RobbieRobotMilitaryGrade extends RobbieRobot {

	public RobbieRobotMilitaryGrade() {
		this.speakBehavior = new CannotSpeak();
	}
}
