// The Visitor pattern is a type of behavioral pattern in which the visitor class will change the 
// execution of code within the element class. The visitor class will pass in its own object into 
// the element classes that implement the visitor class which will change the execution of code. 

public class AlertDisplayVisitor implements AlertVisitor {

    public void visit(Smartphone smartphone) {
        System.out.println("SMS: Weather conditions are rough in your area. Drive carefully.");
     }

     public void visit(TV tv) {
        System.out.println("Channel 3 says: Stay indoors. Weather conditions are rough in the area.");
     }

     public void visit(Radio radio) {
        System.out.println("WCME Radio says: stay indoors.");
     }
     
	public static void main(String[] args) {

	    // smartphone alert
	    Alert smartphoneAlert = new Smartphone();
	    smartphoneAlert.alert(new AlertDisplayVisitor());

	    // TV alert
	    Alert tvAlert = new TV();
	    tvAlert.alert(new AlertDisplayVisitor());

	    // radio alert
	    Alert radioAlert = new Radio();
	    radioAlert.alert(new AlertDisplayVisitor());
	}

}
