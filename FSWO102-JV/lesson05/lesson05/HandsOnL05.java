package lesson05;

public class HandsOnL05 {

	class Person {
		private String firstName;
		private String lastName;
		private int age;
		
		public Person () {
		}
		public Person(String firstName) {
			this(firstName, null);
		}
		public Person(String firstName, String lastName) {
			this(firstName, lastName, 0);
		}
		public Person(String firstName, String lastName, int age) {
			this.firstName = firstName;
			this.lastName = lastName;
//			this.age = age;
			checkAge(age);
		}
		
		public void checkAge(int age) {
			if (age < 0) {
				System.out.println("Attempted to set age to an invalid value. Setting age to 0 instead.");
			}
			this.age = (age < 0)? 0 : age;
		}
		
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
			checkAge(age);
		}

	}
	public static void main(String[] args) {
		
		HandsOnL05 ho = new HandsOnL05();
		
		Person billBarnes = ho.new Person("Bill", "Barnes");
		billBarnes.setAge(22);
		display(billBarnes);
		
		Person sallySmith = ho.new Person("Sally", "Smith", 13);
		display(sallySmith);
		
		Person gasterParsons = ho.new Person();
		gasterParsons.setFirstName("Gaster");
		gasterParsons.setLastName("Parsons");
		gasterParsons.setAge(33);
		display(gasterParsons);
		System.out.println("Attempting to update age to -10...");
		gasterParsons.setAge(-10);
		display(gasterParsons);
		
		System.out.println("\r\nAttempting to create Ana Louder with age = -1");
		Person anaLouder = ho.new Person("Ana", "Louder", -1);
		display(anaLouder);

	}
	
	public static void display(Person person) {
		System.out.println("\r\n" + person.getFirstName()+ " " + person.getLastName() + " " + person.getAge());
	}

}
