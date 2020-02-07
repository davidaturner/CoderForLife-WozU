package com.davidaturner.designpattern.classes;

import com.davidaturner.designpattern.interfaces.Pizza;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Cheese Pizza prepared.");

	}

	@Override
	public void bake() {
		System.out.println("Cheese Pizza baked.");

	}

	@Override
	public void cut() {
		System.out.println("Cheese Pizza sliced.");

	}

	@Override
	public void box() {
		System.out.println("Cheese Pizza boxed and ready to go!");

	}

}
