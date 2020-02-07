package com.davidaturner.designpattern.classes.ny;

import com.davidaturner.designpattern.interfaces.Pizza;

public class NYStylePepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("NYStyle Pepperoni Pizza prepared.");
		
	}

	@Override
	public void bake() {
		System.out.println("NYStyle Pepperoni Pizza baked.");
		
	}

	@Override
	public void cut() {
		System.out.println("NYStyle Pepperoni Pizza sliced.");
		
	}

	@Override
	public void box() {
		System.out.println("NYStyle Pepperoni Pizza boxed.");
		
	}

}
