package handsOnL09;

import java.util.Scanner;

public class StudentHelper {
	
    @SuppressWarnings("resource")
    public static String ReadInputString(){

        Scanner scan = new Scanner(System.in);
        String scanned = scan.nextLine();
        return scanned;
    }

    @SuppressWarnings("resource")
    public static int ReadInputInt(){

        Scanner scan = new Scanner(System.in);
        int scanned = scan.nextInt();
        return scanned;
    }


    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }
}
