
public class Student {
    String firstName;
    String lastName;
    String courseFocus;
    private String initials;

    // constructor
    public Student(){
        firstName = "";
        lastName = "";
        courseFocus = "";
        initials = "";
    }

    // overloaded constructor
    public Student(String first, String last, String focus){
        firstName = first;
        lastName = last;
        courseFocus = focus;
        setInitials();
    }

    // getter method
    public String getFirstName(){
        return firstName;
    }

    // setter method
    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }

    // getter method
    public String getLastName(){
        return lastName;
    }

    // setter method
    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    // getter method
    public String getCourseFocus(){
        return courseFocus;
    }

    // setter method
    public void setCourseFocus(String newCourseFocus){
        courseFocus = newCourseFocus;
    }

    // private setter method
    private void setInitials(){
        String firstNameInitial = firstName.substring(0,1);
        String lastNameInitial = lastName.substring(0,1);
        initials = firstNameInitial + lastNameInitial;
    }

    // getter method
    public String getInitials(){
        return initials;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // instantiate three student objects
	    Student student1 = new Student("Harry", "Potter", "Flying");
	    Student student2 = new Student("Ron", "Weasley", "Herbology");
	    Student student3 = new Student("Hermione", "Granger", "Potions");

	    // print the student names and initials
	    System.out.println(student1.getFirstName() + " " + student1.getLastName() + ": " + student1.getInitials());
	    System.out.println(student2.getFirstName() + " " + student2.getLastName() + ": " + student2.getInitials());
	    System.out.println(student3.getFirstName() + " " + student3.getLastName() + ": " + student3.getInitials());
	}
}
