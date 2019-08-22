package project;

import java.util.Scanner;

public class ScannerConsoleReader implements IConsoleReader {

	private static Scanner reader;
	
	@Override
	public String readLine(String prompt) {
		System.out.print(prompt);
		return readLine();
	}

	@Override
	public String readNoFormatted(String prompt) {
		System.out.print("\r\n" + prompt + ": ");
		return readLine();
	}

	@Override
	public String readLine() {

		if (reader == null) {
			reader = new Scanner(System.in);
		}
		
		return reader.nextLine();
		
	}

	public static void main(String[] args) {
		ScannerConsoleReader reader = new ScannerConsoleReader();
		String test = reader.readLine();
		System.out.println(test);
		
		test = reader.readLine("\r\nTest 2> ");
		System.out.println(test);
		
		test = reader.readNoFormatted("Test 2");
		System.out.println(test);

	}

}
