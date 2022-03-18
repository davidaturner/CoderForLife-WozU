
public class Operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this will evaluate to a boolean value
		int a = 5;
		int b = 5;
		System.out.println(a == b);
		
		a = 5;
		b = 6;
		System.out.println(a == b);
		
		boolean result = a == b;
		System.out.println(result);
		
		// All 3 vars have the same string value: My dog Fido.
		String var1 = "My dog Fido.";
		String var2 = "My dog Fido.";
		String var3 = new String("My dog Fido.");

		// TRUE! because both are assigned to the same literal
		boolean equal12 = (var1 == var2);
		System.out.println(equal12);

		// FALSE! `var3` is created using `new`
		boolean equal23 = (var2 == var3);
		System.out.println(equal23);
		
		var2 = "My DOG Fido.";
		System.out.println(var1 == var2);
		System.out.println(var2 == var3);
		
		// declare the variables needed
		int rating = 4;

		// if the user rated the restaurant 5-stars, print "This food is the best! I could eat this every day."
		if(rating == 5){
		    System.out.println("This food is the best! I could eat this every day.");
		}
		// if the user rated the restaurant 4-stars, print "Good meal."
		else if(rating == 4){
		    System.out.println("Good meal.");
		}
		// if the user rated the restaurant 3-stars, print "It was OK."
		else if(rating == 3){
		    System.out.println("It was OK.");
		}
		// if the user rated the restaurant 2-stars, print "I did not like this, but it's cheap."
		else if(rating == 2){
		    System.out.println("I did not like this, but it's cheap.");
		}
		// if the user rated the restaurant 1-star,  print "I'd rather eat dirt."
		else if(rating == 1){
		    System.out.println("I'd rather eat dirt.");
		}
		
		int frankAge = 30;
		int kevinAge = 40;
		System.out.println(frankAge != kevinAge);
		
		int secondsPerMinute = 60;
		int minutesPerHour = 60;
		System.out.println(secondsPerMinute != minutesPerHour);
		
		
	}

}
