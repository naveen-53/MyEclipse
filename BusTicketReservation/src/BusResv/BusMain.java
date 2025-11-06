package BusResv;

import java.util.Scanner;

public class BusMain {

	public static void main(String[] args){
		
		try {
			
			BusDAO busdao = new BusDAO();
			busdao.displayInfo();
			
			int userop=1;
			Scanner sc=new Scanner(System.in);
			
			
			while(userop==1) {
				System.out.println("Enter 1 to book and 2 to exit.");
				userop=sc.nextInt();
				
				if(userop==1) {
					Booking b1 = new Booking();
					
					if(b1.isAvailable()) {
						
						BookingDAO bookingdao = new BookingDAO();
						bookingdao.addBooking(b1);
						
						System.out.println("Your Booking is Confirmed.");
					}
					else System.out.println("Sorry Bus is Full, Try Another bus.");
				}
				else if (userop==2) { System.out.println("Thank you for visiting us"); }
				else { System.out.println("Wrong input");}	
				
			}
			sc.close();
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}
		
	}
}

