package com.davidaturner.designpattern.interfaces;

public abstract class PizzaStore {
	
		public static String LOCAL_STYLE = "Local Style";
	
		public Pizza orderPizza(String type) {
			
			Pizza pizza = createPizza(type);
			if (pizza != null) {
				
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
				return pizza;
			}
			
			return null;
		}
		
		public String reordered(String type) {	
			return "I see you have ordered " + LOCAL_STYLE + " " + type + ".";
		}
		
		abstract public Pizza createPizza(String type);
	
}
