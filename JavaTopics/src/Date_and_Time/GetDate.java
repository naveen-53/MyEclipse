package Date_and_Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Get date as input from user

public class GetDate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter date in dd-mm-yyyy");
		String input = sc.nextLine();
		
		try {
			Date date = dateFormat.parse(input);
			System.out.println("Date is "+ date);
			
		} 
		catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
