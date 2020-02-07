package com.davidaturner.designpattern;

import com.davidaturner.designpattern.classes.chi.ChicagoStyleCheesePizza;
import com.davidaturner.designpattern.classes.chi.ChicagoStyleMushroomPizza;
import com.davidaturner.designpattern.classes.chi.ChicagoStylePepperoniPizza;
import com.davidaturner.designpattern.classes.chi.ChicagoStyleSausagePizza;
import com.davidaturner.designpattern.interfaces.Pizza;
import com.davidaturner.designpattern.interfaces.SimplePizzaFactory;

public class ChicagoStyleSimplePizzaFactory implements SimplePizzaFactory {

	@Override
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("mushroom")) {
			return new ChicagoStyleMushroomPizza();
		} else if (type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else if (type.equals("sausage")) {
			return new ChicagoStyleSausagePizza();
		} else {
			System.out.println(type + ":pizza type unknown.");
		}
		
		return null;
	}

}
