
public class Toolkit {

    // nested class (inner class)
    public static class StringAssist {

        public static String whisper(String line) {
            String temporaryString = line.toLowerCase();
            return temporaryString;
        }

        public static String yell(String line) {
            String temporaryString = line.toUpperCase();
            return temporaryString;
        }
    }
    
    // another nested class (inner class)
    public static class MathAssist {

        public static boolean isEven(int number) {
            int result = number % 2;
            // if the number has a remainder of 0, it's even
            if(result == 0) {
                return true;
            }
            // otherwise, it's odd
            else{
                return false;
            }
        }

        public static boolean isOdd(int number) {
            int result = number % 2;
            // if the number has a remainder of 0, it's even
            if(result == 0) {
                return false;
            }
            // otherwise, it's odd
            else {
                return true;
            }
        }
    }
    
	public static void main(String[] args) {
	    String sampleString = "Hey There, Neighbor";
	    int number = 9;

	    // whisper
	    String whisper = Toolkit.StringAssist.whisper(sampleString);
	    System.out.println(whisper);

	    // yell
	    String yell = Toolkit.StringAssist.yell(sampleString);
	    System.out.println(yell);

	    // is even
	    boolean isEven = Toolkit.MathAssist.isEven(number);
	    System.out.println(number + " is even? " + isEven);

	    // is odd
	    boolean isOdd = Toolkit.MathAssist.isOdd(number);
	    System.out.println(number + " is odd? " + isOdd);

	}

}
