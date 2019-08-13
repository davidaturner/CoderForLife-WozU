package lesson02;

public class Solution01 {

    public static boolean doesLengthMatch(String source, int count) {
        boolean lengthMatches = source.length() == count;
        return lengthMatches;
    }
	
    public static boolean doesContentMatch(String source, int count) {
        boolean lengthMatches = source.equals("" + count);
        return lengthMatches;
    }
    
	public static void main(String[] args) {
		System.out.println(doesLengthMatch("12345678", 7));

	}

}
