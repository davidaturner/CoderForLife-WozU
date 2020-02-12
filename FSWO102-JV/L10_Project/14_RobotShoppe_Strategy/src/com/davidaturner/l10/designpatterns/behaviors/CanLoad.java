package com.davidaturner.l10.designpatterns.behaviors;

import com.davidaturner.l10.designpatterns.TorsoBehavior;

public class CanLoad implements TorsoBehavior {

	@Override
	public void load() {
		System.out.println("Can support standard head, legs and arms assemblies.");

	}

}
