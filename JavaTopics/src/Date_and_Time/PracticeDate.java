package Date_and_Time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class PracticeDate {

	public static void main(String[] args) {
		 String s = "2025-08-26";
		 
		 LocalDate date = LocalDate.parse(s);
		 
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, dd-MM-yyyy");
		 
		 String formatDate = dtf.format(date);
		 System.out.println(formatDate);
		 String str = date.format(dtf);
		 System.out.println(str);
		 
		 //calculate age
		 
		 String dob="2024-11-06";
		 
		 LocalDate birthDate = LocalDate.parse(dob);
		 
		 LocalDate today = LocalDate.now();
		 
		 Period age = Period.between(birthDate, today);
		 
		 long days = ChronoUnit.MONTHS.between(birthDate, today);
		 
		 //int age = today.getYear() - birthDate.getYear();
		 
		 //System.out.println(days);
		 
		 //System.out.println(age.getYears()+" years "+age.getMonths()+" months "+age.getDays()+"days");
		 
	}

}
