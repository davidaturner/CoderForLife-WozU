import java.util.Scanner;

public class Loops1 {

	public static String getInput() {
		Scanner sc = new Scanner(System.in);  // Create a Scanner object
		System.out.print("ENter: ");
		return sc.nextLine();//read input string
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sayHi = getInput();
		System.out.println(sayHi);
		
		boolean isItTrue = true;
		while(isItTrue){
		    // my input: "Hi!"
		    String userInput = getInput();
		    System.out.println("Echo: " + userInput);

		    // setting this variable to false will tell the loop to stop running
		    isItTrue = false;
		}
		System.out.println("Rest of the code...");
		
		// a boolean variable to be used to determine if you should keep looping
		boolean keepLooping = true;

		// loop if the looping variable is true
		while(keepLooping){
		    // read user input
		    String userInput = getInput();

		    // if user entered "quit", set the looping variable to false
		    if(userInput.equals("quit")){
		        keepLooping = false;
		    }
		    // otherwise, echo the user input
		    else{
		        System.out.println("Echo: " + userInput);
		    }
		}
		// string to show you when you've left the loop and started to run more code
		System.out.println("Rest of the code...");
		
		String userInput2;
		do {
		    System.out.println("Computer: Hi");
		    // read user input
		    userInput2 = getInput();
		    // echo user input
		    System.out.println("You: " + userInput2);
		}
		while(userInput2.equals("Hi"));

		// illustrates the rest of the code
		System.out.println("Out of the loop");
		
		
	}

}
