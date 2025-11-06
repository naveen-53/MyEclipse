package Date_and_Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
//import java.time.ZoneId;
import java.util.Scanner;

public class DateTimeAPI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		
		LocalDate l = LocalDate.now(); //human readable
		System.out.println(l);
		
		Instant i = Instant.now(); //machine readable
		System.out.println(i);
		
		LocalDate ld = LocalDate.of(2025, Month.MARCH, 5);
		System.out.println(ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		
//		for(String val : ZoneId.getAvailableZoneIds()) {
//			System.out.println(val);
//		}
		

	}

}
