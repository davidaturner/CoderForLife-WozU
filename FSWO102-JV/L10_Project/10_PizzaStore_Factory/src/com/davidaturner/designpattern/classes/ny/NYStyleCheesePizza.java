package com.davidaturner.designpattern.classes.ny;

import com.davidaturner.designpattern.interfaces.Pizza;

public class NYStyleCheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("NYStyle Cheese Pizza prepared.");

	}

	@Override
	public void bake() {
		System.out.println("NYStyle Cheese Pizza baked.");

	}

	@Override
	public void cut() {
		System.out.println("NYStyle Cheese Pizza sliced.");

	}

	@Override
	public void box() {
		System.out.println("NYStyle Cheese Pizza boxed.");

	}

}
