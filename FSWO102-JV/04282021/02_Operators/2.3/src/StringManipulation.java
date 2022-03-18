
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String morningGreeting = "Good Morning";
		String name = "Alex";
		System.out.println(morningGreeting);
		System.out.println(name);
		
		morningGreeting = "Good Morning";
		name = "Alex";
		System.out.println(morningGreeting + name);
		
		morningGreeting = "Good Morning";
		name = "Alex";
		System.out.println(morningGreeting + " " + name);
		
		boolean isProgrammer = true;
		System.out.println("Am I a programmer? " + isProgrammer);

		int age = 30;
		System.out.println("My age: " + age);
		
		morningGreeting = "Good Morning";
		System.out.println(morningGreeting.length());
		
		morningGreeting = "Good Morning";
		int greetingLength = morningGreeting.length();
		System.out.println(greetingLength);
		
		morningGreeting = "Good Morning";
		System.out.println(morningGreeting.toUpperCase());
		System.out.println(morningGreeting.toLowerCase());
		
		
	}

}
