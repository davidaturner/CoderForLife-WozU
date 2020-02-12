package com.davidaturner.l10.designpatterns.behaviors;

import com.davidaturner.l10.designpatterns.HeadBehavior;

public class CanSpeakFluently implements HeadBehavior {

	@Override
	public void speak() {
		System.out.println("Can speak 60 different languages.");

	}

}
