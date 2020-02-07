package com.davidaturner.designpattern;

import com.davidaturner.designpattern.classes.ny.NYStyleCheesePizza;
import com.davidaturner.designpattern.classes.ny.NYStyleMushroomPizza;
import com.davidaturner.designpattern.classes.ny.NYStylePepperoniPizza;
import com.davidaturner.designpattern.classes.ny.NYStyleSausagePizza;
import com.davidaturner.designpattern.interfaces.Pizza;
import com.davidaturner.designpattern.interfaces.PizzaStore;

public class ANYStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("mushroom")) {
			return new NYStyleMushroomPizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else if (type.equals("sausage")) {
			return new NYStyleSausagePizza();
		} else {
			System.out.println(type + ":pizza type unknown.");
		}
		
		return null;
	}

}
