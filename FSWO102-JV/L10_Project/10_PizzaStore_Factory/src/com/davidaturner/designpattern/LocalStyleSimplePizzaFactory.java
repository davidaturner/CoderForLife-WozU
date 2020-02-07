package com.davidaturner.designpattern;

import com.davidaturner.designpattern.classes.CheesePizza;
import com.davidaturner.designpattern.classes.MushroomPizza;
import com.davidaturner.designpattern.classes.PepperoniPizza;
import com.davidaturner.designpattern.classes.SausagePizza;
import com.davidaturner.designpattern.interfaces.Pizza;
import com.davidaturner.designpattern.interfaces.SimplePizzaFactory;

public class LocalStyleSimplePizzaFactory implements SimplePizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new CheesePizza();
		}
		else if (type.equals("mushroom")) {
			return new MushroomPizza();
		} else if (type.equals("pepperoni")) {
			return new PepperoniPizza();
		} else if (type.equals("sausage")) {
			return new SausagePizza();
	} else {
		System.out.println(type + ":pizza type unknown.");
	}
		return null;
	}

}
