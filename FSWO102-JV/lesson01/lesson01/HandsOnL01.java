package lesson01;

public class HandsOnL01 {

	public static void Step01(boolean isSunny) {		
//		boolean isSunny = true;
		
		if (isSunny) {
			wearSunglasses();
		} else {
			dontWearSunglasses();
		}		
	}
	
	public static void wearSunglasses() {
		System.out.println("Wear sunglasses!");
	}
	public static void dontWearSunglasses() {
		System.out.println("Don't wear sunglasses.");
	}
	public static void dontNeedSunglasses() {
		System.out.println("Don't need to wear sunglasses.");
	}
	
	public static void Step02(boolean isSunny, boolean atBeach) {		
//		boolean isSunny = true;
//		boolean atBeach = true;
		
		if (isSunny) {
			wearSunglasses();
			if (atBeach) {
				wearSunblock();
			} else {
				dontNeedSunblock();
			}
		} else {
			dontNeedSunglasses();
		}		
	}
	
	public static void wearSunblock() {
		System.out.println("Wear sunblock!");
	}
	public static void dontNeedSunblock() {
		System.out.println("Don't need sunblock.");
	}
	
	public static void Step03(boolean isSunny, boolean atBeach) {		
//		boolean isSunny = true;
//		boolean atBeach = true;
		
		if (isSunny) {
			wearSunglasses();
			if (atBeach) {
				wearSunblock();
			} else {
				dontNeedSunblock();
			}
		} else {
			dontNeedSunglasses();
			if (atBeach) {
				comeBackTomorrow();
			} else {
				dontGoToBeach();
			}
		}		
	}	
	public static void comeBackTomorrow() {
		System.out.println("Come back tomorrow.");
	}
	public static void dontGoToBeach() {
		System.out.println("Don't go to the beach.");
	}
	
	public static void main(String[] args) {
		boolean isSunny;
		boolean atBeach;
		
		// Testing Step01
		System.out.println("\r\nTesting Step 01...");
		System.out.println("\r\nisSunny");
		isSunny = true;
		Step01(isSunny);
		System.out.println("\r\n!isSunny");
		isSunny = false;
		Step01(isSunny);
		
		// Testing Step02
		System.out.println("\r\nTesting Step 02...");
		System.out.println("\r\nisSunny && atBeach");
		isSunny = true; atBeach = true;
		Step02(isSunny, atBeach);
		System.out.println("\r\nisSunny && !atBeach");
		isSunny = true; atBeach = false;
		Step02(isSunny, atBeach);
		System.out.println("\r\n!isSunny && atBeach");
		isSunny = false; atBeach = true;
		Step02(isSunny, atBeach);
		
		// Testing Step03
		System.out.println("\r\nTesting Step 03...");
		System.out.println("\r\nisSunny && atBeach");
		isSunny = true; atBeach = true;
		Step03(isSunny, atBeach);
		System.out.println("\r\n!isSunny && atBeach");
		isSunny = false; atBeach = true;
		Step03(isSunny, atBeach);
		System.out.println("\r\n!isSunny && !atBeach");
		isSunny = false; atBeach = false;
		Step03(isSunny, atBeach);
	}

}
