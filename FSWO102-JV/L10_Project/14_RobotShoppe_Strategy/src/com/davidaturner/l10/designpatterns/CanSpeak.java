package com.davidaturner.l10.designpatterns;

import com.davidaturner.l10.interfaces.SpeakBehavior;

public class CanSpeak implements SpeakBehavior {

	@Override
	public String speak() {
		return "Can speak";
	}

}
