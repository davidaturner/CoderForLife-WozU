package com.davidaturner;

import com.davidaturner.designpattern.AChicagoStylePizzaStore;
import com.davidaturner.designpattern.ANYStylePizzaStore;
import com.davidaturner.designpattern.ChicagoStyleSimplePizzaFactory;
import com.davidaturner.designpattern.LocalStyleSimplePizzaFactory;
import com.davidaturner.designpattern.NYStyleSimplePizzaFactory;
import com.davidaturner.designpattern.classes.ALocalPizzaStore;
import com.davidaturner.designpattern.classes.chi.ChicagoStyleMushroomPizza;
import com.davidaturner.designpattern.interfaces.PizzaStore;

public class MyPizzaStore {

	public static void main(String[] args) {
		
		// Simple Factory 
//		RunSimpleFactory();
		
		//vs
		// Factory (Method)
		RunFactoryMethod();
		
	}
	
	public static void RunSimpleFactory() {
		
		// Simple Factory. Concrete class with concrete Factory injected.
		// NOTE how ALocalPizzaStore should never need modification.
		System.out.println("Welcome to my local pizza store!");
		
		ALocalPizzaStore mypizzeria = new ALocalPizzaStore( new LocalStyleSimplePizzaFactory());

		mypizzeria.orderPizza("mushroom");
		System.out.println();
		
		mypizzeria = new ALocalPizzaStore( new NYStyleSimplePizzaFactory());
		mypizzeria.orderPizza("mushroom");
		System.out.println();
		
		mypizzeria = new ALocalPizzaStore( new ChicagoStyleSimplePizzaFactory());
		mypizzeria.orderPizza("musroom");
		System.out.println();
		
		mypizzeria = new ALocalPizzaStore( new ChicagoStyleSimplePizzaFactory());
		mypizzeria.orderPizza("sausage");
	}
	
	public static void RunFactoryMethod() {
		
		// Factory method. Abstract class having abstract Factory method(s). 
		// Forcing use of subclass to implement.
		System.out.println("Welcome to my local pizza store!");
		System.out.println();
		
		orderFromMyFrancise("sausage", "new york store");
		System.out.println();	
		
		orderFromMyFrancise("mushroom", "chicago store");
		System.out.println();
		
		orderFromMyFrancise("pepperoni", "pittsburgh");
		System.out.println();		
	}
	
	public static void orderFromMyFrancise(String type, String francise) {
		if (francise.equals("new york store")) {
			PizzaStore store = new ANYStylePizzaStore();
			store.orderPizza(type);
		} else if (francise.equals("chicago store")) {
			PizzaStore store = new AChicagoStylePizzaStore();
			store.orderPizza(type);
		} else {
			System.out.println(francise+"? Sorry I have no francise there.");
			System.out.println("Can I interest you in some great pizza");
			System.out.println("from my new york or chicago stores?");
		}		
	}

}
