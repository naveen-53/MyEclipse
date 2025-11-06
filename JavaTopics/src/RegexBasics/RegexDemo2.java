package RegexBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		String str ="Hi guys. I'm Naveenkumar";
		
		Pattern p = Pattern.compile("^Hi");
		// ^ - check starting
		Matcher m = p.matcher(str);
		while(m.find()) {
			System.out.println(m.group());
		}
		
		Pattern p1 = Pattern.compile("kumar$");
		// $ - check ending
		Matcher m1 = p1.matcher(str);
		while(m1.find()) {
			System.out.println(m1.group());
		}

	}

}
