
public class Objects1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating a string with variable syntax
		String basicString = "Hi, I'm a String.";
		System.out.println(basicString);

		// creating a string with object syntax
		String fancyString = new String("Hi, I'm also a String.");
		System.out.println(fancyString);
		
		// changing the state of the variable and then printing the result
		String uppercaseString = fancyString.toUpperCase();
		System.out.println(uppercaseString);
		
		String string1 = "";
		System.out.println(string1.isEmpty());

		String string2 = "Text!";
		System.out.println(string2.isEmpty());
		
		String quote = "The quick brown fox jumps over the lazy dog";

		// replacing 'o' with '?'
		quote = quote.replace('o','?');
		System.out.println(quote);
		
		// replacing '?' with 'o'
		quote = quote.replace('?','o');
		System.out.println(quote);
	}

}
