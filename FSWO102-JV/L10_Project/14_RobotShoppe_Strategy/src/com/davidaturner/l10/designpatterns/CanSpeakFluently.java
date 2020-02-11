package com.davidaturner.l10.designpatterns;

import com.davidaturner.l10.interfaces.SpeakBehavior;

public class CanSpeakFluently implements SpeakBehavior {

	@Override
	public String speak() {
		return "Can speak fluently";
	}

}
