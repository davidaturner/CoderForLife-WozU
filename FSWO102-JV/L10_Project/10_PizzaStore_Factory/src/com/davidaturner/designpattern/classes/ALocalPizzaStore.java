package com.davidaturner.designpattern.classes;

import com.davidaturner.designpattern.interfaces.Pizza;
import com.davidaturner.designpattern.interfaces.SimplePizzaFactory;

public class ALocalPizzaStore {

	private SimplePizzaFactory factory;
	
	// Simple Factory: Concrete class injecting concrete factory.
	public ALocalPizzaStore( SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		if (pizza != null) {
			
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();	
			return pizza;
		}
		
		return null;
	}
}
