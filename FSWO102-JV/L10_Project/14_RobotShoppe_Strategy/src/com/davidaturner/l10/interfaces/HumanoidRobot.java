package com.davidaturner.l10.interfaces;

import com.davidaturner.l10.designpatterns.ArmsBehavior;
import com.davidaturner.l10.designpatterns.HeadBehavior;
import com.davidaturner.l10.designpatterns.LegsBehavior;
import com.davidaturner.l10.designpatterns.TorsoBehavior;

public abstract class HumanoidRobot implements Identifiable {

	protected ArmsBehavior armsBehavior;
	protected LegsBehavior legsBehavior;
	protected HeadBehavior headBehavior;
	protected TorsoBehavior torsoBehavior;
	
	public void test() {
	}
	
	public void lift() {
		armsBehavior.lift();
	}
	public void run() {
		legsBehavior.run();
	}
	public void speak() {
		headBehavior.speak();
	}
	public void load() {
		torsoBehavior.load();
	}

}
