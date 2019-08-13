package lesson04;

public class HandsOnL04 {
	
	public static void main(String[] args) {
		
		int val = 2;
		int count = 3;
		
		System.out.println("\r\nValue: " + val);
		System.out.println("Doubled: " + doubleMe(val));
		
		System.out.println("\r\nValue: " + val);
		System.out.println("Quadrupled: " + quadrupleMe(val));		
		
		System.out.println("\r\nValue: " + val);
		System.out.println("Count: " + count);
		System.out.println("Result: " + doubleMeTimes(val, count));
	}

	public static int doubleMe(int val) {
		return val * 2;
	}
	public static int quadrupleMe(int val) {
		return doubleMe( doubleMe(val));
	}
	public static int doubleMeTimes(int val, int count) {
		int result = val;
		while ( count > 0 ) {
			result = doubleMe( result);
			count--;
		}
		return result;
	}
}
