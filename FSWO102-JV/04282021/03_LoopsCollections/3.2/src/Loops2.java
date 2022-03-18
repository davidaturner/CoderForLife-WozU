
public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// start out with a counter value at 10
		int count = 10;

		// while the counter value is greater than 0, print the value and subtract 1
		while(count > 0){
		    System.out.println(count);

		    // subtract count by one (decrement)
		    count--;
		}

		// once the loop is done, print "Lift Off!"
		System.out.println("Lift Off!");
		
		// start out with a counter value at 10
		// while the counter value is greater than 0, print the value and subtract 1
		for(int count2 = 10; count2 > 0; count2--){
		    System.out.println(count2);
		}

		// once the loop is done, print "Lift Off!"
		System.out.println("Lift Off!");
		
		String[] myArray = { "One", "Two", "Three" };
		for(int i = 0; i < myArray.length; i++) {
		    System.out.println(myArray[i]);
		}
		
		//foreach loop
		for(String val : myArray) {
		    System.out.println(val);
		}
	}

}
