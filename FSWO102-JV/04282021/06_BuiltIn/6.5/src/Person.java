public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private boolean isEmployee;
	
	public String describe() {
		return firstName + " " + lastName + ", " + age + " IsEmployee: " + isEmployee;
	}
	
	public void init(String firstName, String lastName, int age, boolean isEmployee) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age= age;
		this.isEmployee = isEmployee;
	}
	
	// Download json-simple.1.1.1.jar.zip and install jar into project.
//	public void parseFromJSON(JSONObject json) {
//		
//	}
//	
//	public void parseFromJSON(String json) {
//		
//	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isEmployee() {
		return isEmployee;
	}

	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}

	public static void main(String[] args) {
		Person person = new Person();
		person.init("Toby", "Fromme", 37, true);
		
		System.out.println(person.describe());

	}

}
