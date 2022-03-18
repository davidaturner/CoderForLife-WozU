
public class ExceptionEx1 {

	public static void main(String[] args) throws Exception {
		
//		When the code breaks (and it will), developers need to be ready to handle 
//		the behavior of their code. Exceptions are those errors that can be caught 
//		by the developer, which is a Java built-in tool known as a try-catch block. 
//		Below is the syntax of a try-catch block with no code, followed by a valid 
//		Java code block that implements a try-catch block around a divide-by-zero error.
		
	    int result = 0;
	    // try to divide by zero and print the result
	    try{
	        result = 1/0;
	    }
	    // print error message if an error is encountered
	    catch(Exception e){
	        System.out.println("An error occurred when calculating the result.");
	        result = -1;
	    }
	}

}
