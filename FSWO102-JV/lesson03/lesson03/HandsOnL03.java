package lesson03;

public class HandsOnL03 {

	public static void main(String[] args) {
	
		int[] intArray = {0, 0, 0, 0, 0};
		displayArray(intArray);
		
		System.out.println("Enter five numbers please: ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = StudentHelper.ReadInputInt();
		}	
		
		displayArray(intArray);
		reverseArray(intArray);
		displayOddIndex(intArray);
		
		/*
		Step01(intArray);
		Step02(intArray);
		Step03(intArray);
		*/
		
	}
	
	public static void displayArray(int[] arrayToBeDisplayed) {
		System.out.println("\r\nDISPLAYED: ");
		for(int number: arrayToBeDisplayed) {
			System.out.print(number + " ");
		}
		System.out.println(" size: " + arrayToBeDisplayed.length);
	}
	public static void reverseArray(int[] arrayToBeDisplayed) {
		System.out.println("\r\nDISPLAYED IN REVERSE: ");
		for(int i=arrayToBeDisplayed.length-1; i>=0; i--) {
			int number = arrayToBeDisplayed[i];
			System.out.print(number + " ");
		}
		System.out.println(" size: " + arrayToBeDisplayed.length);
	}
	public static void displayOddIndex(int[] arrayToBeDisplayed) {
		System.out.println("\r\nDISPLAYING ODD INDEX VALUES ONLY: ");
		int oddIndex = 0;
		for(int i=0;i<arrayToBeDisplayed.length; i++) {
			if (i % 2 != 0) {
				int number = arrayToBeDisplayed[i];
				System.out.print(number + " ");
				oddIndex++;
			}
		}
		System.out.println(" size: " + oddIndex);
	}
	
	public static void Step01(int[] intArray) {
		System.out.println("Enter five numbers please: ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = StudentHelper.ReadInputInt();
		}
		displayArray(intArray);		
	}	
	public static void Step02(int[] intArray) {
		System.out.println("Enter five numbers please: ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = StudentHelper.ReadInputInt();
		}
		reverseArray(intArray);		
	}	
	public static void Step03(int[] intArray) {
		System.out.println("Enter five numbers please: ");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = StudentHelper.ReadInputInt();
		}
		displayOddIndex(intArray);		
	}
}
