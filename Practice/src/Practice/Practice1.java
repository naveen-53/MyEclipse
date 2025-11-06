package Practice;

import java.util.HashSet;

public class Practice1 {

	public static void main(String[] args) {
		String s = "Hello";
		
		HashSet<Character> hs = new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			if(hs.contains(s.charAt(i))) {
				System.out.println(s.lastIndexOf(s.charAt(i)));
				break;
			}else
				hs.add(s.charAt(i));
		}
		
		
		

	}

}
