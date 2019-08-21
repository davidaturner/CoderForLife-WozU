package project;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedConsoleReader implements IConsoleReader {

	private static BufferedReader reader;
	
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
			reader = new BufferedReader(
					new InputStreamReader(System.in));
		}

		String result = null;
		try {
			
			result = reader.readLine();
			
		} catch (Exception e) {
			System.out.println("Unable to read user input!");
			return result;
			
		}
		
		return result;

	}

	public static void main(String[] args) {
		
		BufferedConsoleReader console = new BufferedConsoleReader();

		String test = console.readLine();
		
		System.out.println(test);
		
		test = console.readNoFormatted("Now with a prompt");
		System.out.println(test);
		
		test = console.readLine("\r\nNow with a prompt string: ");
		System.out.println(test);
		

	}

}
