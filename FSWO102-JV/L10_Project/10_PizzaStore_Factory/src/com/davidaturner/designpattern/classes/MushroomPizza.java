package com.davidaturner.designpattern.classes;

import com.davidaturner.designpattern.interfaces.Pizza;

public class MushroomPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Mushroom Pizza prepared.");

	}

	@Override
	public void bake() {
		System.out.println("Mushroom Pizza baked.");

	}

	@Override
	public void cut() {
		System.out.println("Mushroom Pizza sliced.");

	}

	@Override
	public void box() {
		System.out.println("Mushroom Pizza boxed.");

	}

}
