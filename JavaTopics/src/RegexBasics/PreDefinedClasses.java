package RegexBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * "\\s" --> denotes space
 * "\\S" --> denotes not a space
 * "\\d" --> denotes numeric character
 * "\\D" --> denotes non numeric character
 * "\\w" --> denotes Alphanumeric character
 * "\\W" --> denotes non Alphanumeric character
 * "\\b" --> denotes word boundary in words
 * "."   --> denotes all character including special character
 */

public class PreDefinedClasses {

	public static void main(String[] args) {
		String s1 = "Naveen Naveenkumar Naveennk";
		
		Pattern p = Pattern.compile("\\s");	
		Matcher m = p.matcher(s1);
		
		while (m.find()) {
			System.out.println(m.group()+" Starts at "+ m.start()+" ends at "+m.end());
		}
		
		System.out.println("-------------------------------------------------------------------");
		String s2= "Naveen123$3#k";
		
		Pattern p1 = Pattern.compile("\\d");	
		Matcher m1 = p1.matcher(s2);
		
		while(m1.find()) {
			System.out.println(m1.group()+" starts at "+m1.start()+" ends at "+m1.end());
		}
		
		System.out.println("-------------------------------------------------------------------");
		String s3= "Naveen !@#123 NK532";
		
		Pattern p2 = Pattern.compile("\\w");
		Matcher m2 = p2.matcher(s3);
		
		while(m2.find()) {
			System.out.println(m2.group()+" Starts at "+m2.start()+" ends at "+m2.end());
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		Pattern p3 = Pattern.compile("\\bNaveen"); // we can give "\\bNaveen\\b"
		Matcher m3 = p3.matcher(s1);
		
		while(m3.find()) {
			System.out.println(m3.group()+" starts at "+m3.start()+" ends at "+m3.end());
		}

	}

}
