package lesson05;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Greeter {

	public static String[] greet1(Person[] people) {
		
		String [] greetings = null;
		
		if (people != null && people.length> 0) {

			for(int i=0; i<people.length; i++) {
				if (greetings == null) {
					greetings = new String[people.length];
				}
				greetings[i] = "Hello " + people[i].firstName + " " + people[i].lastName + "!";
			}
		}
		return greetings;
	}

	public static String[] greet(Person[] people) {		
	
		if (people != null && people.length> 0) {
			
			String [] greetings = new String[people.length];				
			int i = 0;
			while( i < people.length) {
				
				greetings[i] = "Hello " + people[i].firstName + 
										" " + people[i].lastName + "!";
				i++;
			}
			return greetings;
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		int numberOfPersons = 3;
		Person[] people = new Person[numberOfPersons];
		people[0] = new Person("Bill", "Barnes");
		people[1] = new Person("Sally", "Smith");
		people[2] = new Person("Gaster", "Parsons");
		
		String[] greetings = greet(people);
		for(String greet : greetings) {
			System.out.println(greet);
		}
	}

}

class Person {
    String firstName;
    String lastName;

    public Person() {
        firstName = "";
        lastName = "";
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}