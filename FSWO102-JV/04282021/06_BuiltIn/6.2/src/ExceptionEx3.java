
public class ExceptionEx3 {

	public static void main(String[] args) throws Exception {
//		Exceptions don't have to be solely triggered by Java alone. To trigger 
//		an exception, or throw an exception, developers can write code to break 
//		in specific ways by design when something critical is incorrect. To throw an 
//		exception, the main method needs to be modified by appending throw Exception 
//		at the end.
		
	    // SSN is 123-45-6789
//	    int SSN = 123456789;
		int SSN = 000000000;
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
