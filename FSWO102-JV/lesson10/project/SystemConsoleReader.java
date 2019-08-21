package project;

public class SystemConsoleReader implements IConsoleReader {

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
		
		return System.console().readLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
