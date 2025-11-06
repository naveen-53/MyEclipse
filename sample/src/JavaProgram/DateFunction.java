package JavaProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class DateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate obj=LocalDate.now();
		LocalTime obj1=LocalTime.now();
		System.out.println(obj);
		System.out.println(obj1);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Date in this format(dd/mm/yyyy)");
		String dateStr=sc.next();
		
		//parse the input String into Date object using DateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		try {
			// 1. Initialize Date
			// 2. Parsing Scanner object
			// 3. Input from the user with right Format
			Date date = sdf.parse(dateStr);
			// format is used to formatting the date according to sdf
			System.out.println("Input Date: "+sdf.format(date));	
		}
		//ParseException is used to check the format | (dd/mm/yyyy)
		catch(ParseException e) {
			System.out.println("Invalid date Format");
		}
		sc.close();

	}

}
