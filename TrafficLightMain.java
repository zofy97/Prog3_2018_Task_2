package Part_A;

import java.util.Scanner;

public class TrafficLightMain {
	public static void main(String[] args) {
		
		boolean red = true;
		boolean yellow = false;
		boolean green = false;
		
		boolean car = false;
		
		try(Scanner scan = new Scanner(System.in))	{
			String message;
			do	{
				System.out.println("Is a car coming? yes / no ");
				message = scan.next();
				if(message.equals("yes"))	{
					car = true;
					if(green == false && yellow == false && red == true) {
						System.out.println("Traffic light: ");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}						
						System.out.println("red");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						red = false;
						yellow = true;
						System.out.println("yellow");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						yellow = false;
						green = true;
						System.out.println("green");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						car = false;
						green = false;
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("green");
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				} else if (message.equals("no")) {
					System.out.println("Traffic light: ");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}						
					System.out.println("green");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					green = false;
					yellow = true;
					System.out.println("yellow");
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					yellow = false;
					red = true;
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("red");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} while(!message.equals("exit"));
			}	
		}
}
