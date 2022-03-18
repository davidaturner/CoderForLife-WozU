
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println("Hello Again, World!");
		printHelloWorld();
	    greetPerson("George");
	    greetPerson("Thomas");
	    greetPerson("Theodore");
	    greetPerson("Abraham");
	    
	    System.out.println(isEven(0));
	    
	    int num1 = 1;
	    int num2 = 2;

	    // invoke the "add" method with two integer parameters
	    add(num1, num2);
	}
	
	// the new method that contains a print statement
	public static void printHelloWorld(){
	    System.out.println("Hello Again, World!");
	}

	// a method which takes one input of type String
	public static void greetPerson(String name){
	    System.out.println("Hello " + name);
	}
	
	public static boolean isEven(int number){
	    boolean result;

	    // if the number is even, set variable to true
	    if(number % 2 == 0){
	        result = true;
	    }
	    // otherwise, set variable to false
	    else{
	        result = false;
	    }

	    // return the variable
	    return result;
	}


	public static void add(int number1, int number2){
	    System.out.println(number1 + number2);
	}

}
