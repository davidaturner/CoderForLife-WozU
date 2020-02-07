package com.davidaturner.designpattern.classes.chi;

import com.davidaturner.designpattern.interfaces.Pizza;

public class ChicagoStyleSausagePizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("ChicagoStyle Sausage pizza prepared.");

	}

	@Override
	public void bake() {
	System.out.println("ChicagoStyle Sausage pizza baked.");

	}

	@Override
	public void cut() {
		System.out.println("ChicagoStyle Sausage pizza sliced.");

	}

	@Override
	public void box() {
		System.out.println("ChicagoStyle Sausage pizza boxed.");

	}

}
