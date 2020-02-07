package com.davidaturner.designpattern.classes;

import com.davidaturner.designpattern.interfaces.SimplePizzaFactory;

public class ALocalPizzaStore {

	private SimplePizzaFactory factory;
	
	// Simple Factory: Concrete class injecting concrete factory.
	public ALocalPizzaStore( SimplePizzaFactory factory) {
		this.factory = factory;
	}
}
