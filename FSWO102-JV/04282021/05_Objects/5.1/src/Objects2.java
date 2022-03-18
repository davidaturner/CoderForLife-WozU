
public class Objects2 {

	public class Student {
	    String firstName;
	    String lastName;
	    String courseFocus;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scope exercise.
		// student 1
		if (true == true) {
			
			String firstName = "James";
			String lastName = "Gosling";
			String courseFocus = "Java";
			System.out.println(firstName + " " + lastName + " is studying " + courseFocus);
		}	
		if (true == true)
		{
		    // student 2
		    String firstName = "Anders";
		    String lastName = "Hejlsberg";
		    String courseFocus = "C#";
		    System.out.println(firstName + " " + lastName + " is studying " + courseFocus);
		}
	}

}
