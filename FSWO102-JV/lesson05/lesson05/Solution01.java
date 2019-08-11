package lesson05;

public class Solution01 {

	public static void main(String[] args) {
		String quote = "The quick brown fox jumps over the lazy dog";
		System.out.println(quote);
		
		// replacing 'o' with '?'
		quote = quote.replace('o','?');
		
		System.out.println(quote);
		// replacing 'q' with 'v'		
		quote = quote.replace('q','v');
		System.out.println(quote);

	}

}
