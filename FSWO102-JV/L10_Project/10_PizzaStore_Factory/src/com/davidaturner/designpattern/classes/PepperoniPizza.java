package com.davidaturner.designpattern.classes;

import com.davidaturner.designpattern.interfaces.Pizza;

public class PepperoniPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Pepperoni Pizza prepared.");
		
	}

	@Override
	public void bake() {
		System.out.println("Pepperoni Pizza baked.");
		
	}

	@Override
	public void cut() {
		System.out.println("Pepperoni Pizza sliced.");
		
	}

	@Override
	public void box() {
		System.out.println("Pepperoni Pizza boxed.");
		
	}

}
