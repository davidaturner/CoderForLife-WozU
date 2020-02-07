package com.davidaturner.designpattern.classes.chi;

import com.davidaturner.designpattern.interfaces.Pizza;

public class ChicagoStyleCheesePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("ChicagoStyle Cheese pizza prepared.");

	}

	@Override
	public void bake() {
		System.out.println("ChicagoStyle Cheese pizza baked.");

	}

	@Override
	public void cut() {
		System.out.println("ChicagoStyle Cheese pizza sliced.");

	}

	@Override
	public void box() {
		System.out.println("ChicagoStyle Cheese pizza boxed.");

	}

}
