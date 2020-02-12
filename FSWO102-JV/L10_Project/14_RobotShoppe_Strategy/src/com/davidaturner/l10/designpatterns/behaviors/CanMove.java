package com.davidaturner.l10.designpatterns.behaviors;

import com.davidaturner.l10.designpatterns.LegsBehavior;

public class CanMove implements LegsBehavior {

	@Override
	public void run() {
		System.out.println("Can move up to 2mph.");

	}

}
