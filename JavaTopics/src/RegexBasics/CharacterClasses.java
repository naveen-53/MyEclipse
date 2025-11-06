package RegexBasics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClasses {

	public static void main(String[] args) {
		
		String s1 = "abcaaabbbccc";
		
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher(s1);
		
		while(m.find()) {
			System.out.println(m.group()+ " finds at "+m.start()+" and ends at "+m.end());
		}
		System.out.println("----------------------------");
		
		Pattern p1 = Pattern.compile("[^ab]");
		Matcher m1 = p1.matcher(s1);
		
		while(m1.find()) {
			System.out.println(m1.group()+ " finds at "+m1.start()+" and ends at "+m1.end());
		}
		System.out.println("----------------------------");
		
		String s2 = "abcaAZ0189$&N";
		
		Pattern p2 = Pattern.compile("[a-zA-Z]");
		Matcher m2 = p2.matcher(s2);
		
		while(m2.find()) {
			System.out.println(m2.group()+ " finds at "+m2.start()+" and ends at "+m2.end());
		}
		System.out.println("----------------------------");
		
		Pattern p3 =Pattern.compile("[^a-zA-Z0-9]");
		Matcher  m3 = p3.matcher(s2);
		
		while(m3.find()) {
			System.out.println(m3.group()+" finds at "+m3.start()+" and ends at "+m3.end());
		}

	}

}
