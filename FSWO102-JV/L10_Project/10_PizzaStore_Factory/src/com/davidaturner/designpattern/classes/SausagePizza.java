package com.davidaturner.designpattern.classes;

import com.davidaturner.designpattern.interfaces.Pizza;

public class SausagePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Sausage Pizza prepared.");

	}

	@Override
	public void bake() {
		System.out.println("Sausage Pizza baked.");

	}

	@Override
	public void cut() {
		System.out.println("Sausage Pizza sliced.");

	}

	@Override
	public void box() {
		System.out.println("Sausage Pizza boxed.");

	}

}
