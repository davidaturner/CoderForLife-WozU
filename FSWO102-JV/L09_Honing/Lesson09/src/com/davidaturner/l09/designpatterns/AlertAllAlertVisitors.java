package com.davidaturner.l09.designpatterns;

import com.davidaturner.l09.interfaces.AlertVisitor;
import com.davidaturner.l09.interfaces.Alertable;

public class AlertAllAlertVisitors implements AlertVisitor {

	@Override
	public void alert(Smartphone smartPhone) {
        System.out.println("SMS: Weather conditions are rough in your area. Drive carefully.");

	}

	@Override
	public void alert(TV tv) {
		System.out.println("Channel 3 says: Stay indoors. Weather conditions are rough in the area.");

	}

	@Override
	public void alert(Radio radio) {
		System.out.println("WCME Radio says: stay indoors.");

	}

}
