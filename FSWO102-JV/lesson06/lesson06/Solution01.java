package lesson06;

public class Solution01 {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("This is the end.");
		System.out.println(str.length() + " " + str.toString());
		str.setCharAt(1, 'z');
		System.out.println(str.length() + " " + str.toString());

	}

}
