
public class Operators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isHungry = true;
		boolean isRestaurantOpen = true;

		if(isHungry && isRestaurantOpen){
		    System.out.println("Go to the restaurant!");
		}
		else{
		    System.out.println("Don't go to the restaurant.");
		}
		
		boolean isSleepy = false;
		boolean isLibraryClosed = true;

		if(isSleepy || isLibraryClosed) {
		    System.out.println("You should leave now.");
		}
		else {
		    System.out.println("Keep on studying!");
		}
		
		isSleepy = false;
		isLibraryClosed = true;
		boolean isBatteryDead = true;

		if(isSleepy || isLibraryClosed || isBatteryDead) {
		    System.out.println("You should leave now.");
		}
		else {
		    System.out.println("Keep on studying!");
		}
		
		isSleepy = false;
		isLibraryClosed = false;
		isBatteryDead = false;

		if(isSleepy || isLibraryClosed || isBatteryDead) {
		    System.out.println("You should leave now.");
		}
		else {
		    System.out.println("Keep on studying!");
		}
		
		System.out.println(true);
		System.out.println(!true);
		
		boolean isDaytime = true;
		System.out.println(!isDaytime);
		
		String var1 = new String("My dog Fido.");
		String var2 = new String("My dog Spot.");   // different dog name

		// Test for equality
		// FALSE! "var1" and "var2" are not equal
		boolean equal12 = var1.equals(var2);

		// Test for Inequality (note the not operator)
		// TRUE! "var1" does NOT (!) equal "var2"
		boolean notEqual12 = !var1.equals(var2);
		
		isSleepy = true;
		isLibraryClosed = true;
		isBatteryDead = false;

		if(isSleepy || isLibraryClosed && isBatteryDead){
		    System.out.println("You should leave now.");
		}
		else{
		    System.out.println("Keep on studying!");
		}
		
		boolean a = false;
		boolean b = false;
		boolean c = true;

		// this is true
		System.out.println(a || b || c);

		// this is false
		System.out.println(a || b && c);

		/*
		    Here's the breakdown:

		    a || b && c
		    a || (b && c)
		    a || (false && true)
		    a || false
		    false || false
		    false
		*/
		
		int e = 2;
		int f = 4;
		if(e < f){
		    System.out.println("e is less than f");
		}
		
		e = 4;
		f = 4;
		if(e < f){
		    System.out.println("e is less than f");
		}
		
		e = 4;
		f = 4;
		if(e <= f){
		    System.out.println("e is less than or equal to f");
		}
		
		// declare the user's age in an integer variable
		int userAge = 17;

		// if the user's age at least 18 (greater than or equal to 18), then they can purchase tickets.
		if(userAge >= 18){
		    System.out.println("Here are your tickets. Enjoy the movie!");
		}
		// otherwise, (they are not at least 18) they cannot purchase the tickets.
		else{
		    System.out.println("Sorry, you are too young to purchase tickets for this movie.");
		}
	}

}
