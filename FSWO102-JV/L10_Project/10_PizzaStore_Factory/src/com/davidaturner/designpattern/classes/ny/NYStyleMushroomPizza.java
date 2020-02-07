package com.davidaturner.designpattern.classes.ny;

import com.davidaturner.designpattern.interfaces.Pizza;

public class NYStyleMushroomPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("NYStyle Mushroom Pizza prepared.");

	}

	@Override
	public void bake() {
		System.out.println("NYStyle Mushroom Pizza baked.");

	}

	@Override
	public void cut() {
		System.out.println("NYStyle Mushroom Pizza sliced.");

	}

	@Override
	public void box() {
		System.out.println("NYStyle Mushroom Pizza boxed.");

	}

}
