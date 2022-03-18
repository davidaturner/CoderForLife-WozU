
public class ExceptionEx2 {

	public static void main(String[] args) throws Exception {
		
//		There is another construct which can be attached to the try-catch block. 
//		It's the finally keyword and is used to continue with the rest of the code 
//		after the try-catch block has finished. Note that although code could be 
//		placed following the catch block, the finally block is used for code that 
//		fits within the context of the rest of the code. Below is an extension of 
//		the previous code snippet that will print the result in the finally.
		
		int result = 0;

		try{
		    result = 1/0;
		}
		catch(Exception e){
		    System.out.println("An error occurred when calculating the result.");
		    result = -1;
		    e.printStackTrace();
		}
		finally{
		    System.out.println("The new result is: " + result);
		}

	}

}
