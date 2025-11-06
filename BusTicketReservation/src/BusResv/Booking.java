package BusResv;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Booking  {
	
	String passname;
	int busno;
	Date date;

	Booking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Passanger Name: ");
		passname =sc.next();
		
		System.out.println("Enter Bus no: ");
		busno =sc.nextInt();
		
		System.out.println("Enter Date (dd-mm-yyyy) : ");
		String dateInput = sc.next();
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateformat.parse(dateInput);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		

	}
	public boolean isAvailable() throws SQLException {
		BusDAO busdao = new BusDAO();
		BookingDAO bookingdao = new BookingDAO();
		
		int capacity = busdao.getCapacity(busno);
		
		int booked = bookingdao.getBookedCount(busno, date);
		
		return booked<capacity?true:false;
	}
	
}