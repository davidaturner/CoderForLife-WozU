package com.davidaturner.designpattern.classes.chi;

import com.davidaturner.designpattern.interfaces.Pizza;

public class ChicagoStylePepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("ChicagoStyle Pepperoni pizza prepared.");
		
	}

	@Override
	public void bake() {
		System.out.println("ChicagoStyle Pepperoni pizza baked.");
		
	}

	@Override
	public void cut() {
		System.out.println("ChicagoStyle Pepperoni pizza sliced.");
		
	}

	@Override
	public void box() {
		System.out.println("ChicagoStyle Pepperoni pizza boxed.");
		
	}

}
