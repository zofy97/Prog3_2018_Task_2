package Crossing;

/**
 * @Sophie Schauer s0559289
 * This class is the traffic light, which changes it's colours.
 * The sensor invokes the appropriate method.
 */

public class TrafficLight {
	static boolean red;
	static boolean yellow;
	static boolean green;
	
	public static int switchToGreen()	{
		
		System.out.println("Traffic light: ");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}	
		
		red = true;
		System.out.println("red");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		red = false;
		yellow = true;
		System.out.println("yellow");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return -1;
		}
		
		yellow = false;
		green = true;
		System.out.println("green");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}

		System.out.println();

		return 0;
	}
	
	public static int switchToRed()	{
		
		System.out.println("Traffic light: ");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		 green = true;
		System.out.println("green");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		green = false;
		yellow = true;
		System.out.println("yellow");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		yellow = false;
		red = true;
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		System.out.println("red");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}

		System.out.println();

		return 0;
	}
	
	public static int stayGreen()	{
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		green = true;
		System.out.println("green");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}

		System.out.println();

		return 0;
	}
	
	public static int stayRed()	{
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
		red = true;
		System.out.println("red");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}

		System.out.println();

		return 0;
	}
}