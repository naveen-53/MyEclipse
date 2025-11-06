package RegexBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		String str ="Hi guys. I'm Naveenkumar";
		
		Pattern p = Pattern.compile("guys");
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println(m.group()+ " finds at "+m.start()+" and ends at "+m.end());
		}

	}

}
