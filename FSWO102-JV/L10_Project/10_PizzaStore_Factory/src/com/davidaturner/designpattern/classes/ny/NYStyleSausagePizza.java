package com.davidaturner.designpattern.classes.ny;

import com.davidaturner.designpattern.interfaces.Pizza;

public class NYStyleSausagePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("NYStyle Sausage Pizza prepared.");

	}

	@Override
	public void bake() {
		System.out.println("NYStyle Sausage Pizza baked.");

	}

	@Override
	public void cut() {
		System.out.println("NYStyle Sausage Pizza sliced.");

	}

	@Override
	public void box() {
		System.out.println("NYStyle Sausage Pizza boxed.");

	}

}
