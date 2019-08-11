package lesson03;

public class Solution01 {

	public String[] newArray() {
		String[] musician = {"John","Mike","Joe","Kevin"};
		return musician;
	}
	
    public static int[] doubleArray(int[] numbers) {
        int[] results = new int[numbers.length];

        int i = 0;
        for(int number: numbers) {
        	number *= 2;
        	results[i++] = number;
        }

        return results;
    }
    
    public static double getAverage(int[] numbers) {
        double results = 0.0;
        if(numbers.length > 0) {
          int i = 0;
          do {
            results += numbers[i++];
          } while (i < numbers.length);
          results /= numbers.length;
        }
        return results;
    }
    
	public static void main(String[] args) {
		Test02();
	}
	
	public static void Test01 () {
		int[] testNumbers = {1, 2, 3, 4, 5};
		int[] numbersToBeDisplayed = doubleArray(testNumbers);
		for(int number: numbersToBeDisplayed) {
			System.out.print(number + " " );
		}
		System.out.println(" size: " + numbersToBeDisplayed.length);
	}
	
	public static void Test02 () {
		int[] testNumbers = {1, 2, 3, 4, 5};
		double result = getAverage(testNumbers);
		System.out.println(result);
	}

}
