package lesson06;

public class Solution02 {

	public static void main(String[] args) {
		System.out.println(Example01(2));
		System.out.println(Example01(0));
		
		System.out.println("\r\n");
		try {
		    // SSN is 123-45-6789
			System.out.println("Example02: SSN is 123-45-6789...");
			Example02(123456789);
			// SSN is 000-00-0000
			System.out.println("Example02: SSN is 000-00-0000...");
			Example02(000000000);
		} catch (Exception e){
			System.out.println("Exception wasnt already caught! Do Something!");
		}
	}

	public static int Example01 (int denom) {
	    int result = 0;
	    // try to divide by denom and print the result
	    System.out.println("Example01: Try to divide by denom: " + denom);
	    try{
	        result = 1/denom;
	    }
	    // print error message if an error is encountered
	    catch(Exception e){
	        System.out.println("An error occurred when calculating the result.");
	        result = -1;
	        e.printStackTrace();
	        return result;
	    } 
	    
	    return result;
	}
	
	public static void Example02(int SSN) throws Exception {
	    // SSN is 123-45-6789

	    try {
	        // if SSN is 000-00-0000
	        if(SSN == 000000000){
	            throw new Exception("User SSN Undeclared!");
	        }
	        else {
	            System.out.println("Everything looks good here");
	        }
	    }
	    catch(Exception e) {
	        System.out.println(e.getMessage());
	    }
	}
}
