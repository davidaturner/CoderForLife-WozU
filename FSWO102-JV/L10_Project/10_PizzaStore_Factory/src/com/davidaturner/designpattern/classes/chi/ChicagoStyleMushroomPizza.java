package com.davidaturner.designpattern.classes.chi;

import com.davidaturner.designpattern.interfaces.Pizza;

public class ChicagoStyleMushroomPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("ChicagoStyle Mushroom pizza prepared.");
		
	}

	@Override
	public void bake() {
		System.out.println("ChicagoStyle Mushroom pizza baked.");
		
	}

	@Override
	public void cut() {
		System.out.println("ChicagoStyle Mushroom pizza sliced.");
		
	}

	@Override
	public void box() {
		System.out.println("ChicagoStyle Mushroom pizza boxed.");
		
	}

}
