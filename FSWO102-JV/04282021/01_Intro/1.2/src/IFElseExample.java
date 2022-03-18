
public class IFElseExample {

	public static void main(String[] args) {
		
		boolean thingThatCouldBeTrueOrFalse = true;

		if (thingThatCouldBeTrueOrFalse) {
		    System.out.println("thingThatCouldBeTrueOrFalse");
		}
		
		boolean isCold = true;

		if (isCold) {
		    System.out.println("isCold");
		}
		
	    boolean isMarketOpen = true;

	    // if the market is open, print "The market is open!"
	    if (isMarketOpen) {
	        System.out.println("The market is open!");
	    }
	    else {
	        System.out.println("The market is closed.");
	    }

	}

}
