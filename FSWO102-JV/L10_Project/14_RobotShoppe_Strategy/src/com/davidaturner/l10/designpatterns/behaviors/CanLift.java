package com.davidaturner.l10.designpatterns.behaviors;

import com.davidaturner.l10.designpatterns.ArmsBehavior;

public class CanLift implements ArmsBehavior {

	@Override
	public void lift() {
		System.out.println("Can lift up to 500 pounds.");
	}

}
