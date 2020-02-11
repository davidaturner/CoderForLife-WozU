package com.davidaturner.l10.designpatterns;

import com.davidaturner.l10.interfaces.SpeakBehavior;

public class CannotSpeak implements SpeakBehavior {

	@Override
	public String speak() {
		return "Cannot Speak";
	}

}
