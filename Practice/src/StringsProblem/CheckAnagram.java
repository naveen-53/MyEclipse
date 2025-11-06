package StringsProblem;

import java.util.Arrays;

public class CheckAnagram {
	
	static boolean anagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] c1 =s1.toLowerCase().toCharArray();
		Arrays.sort(c1);
		
		char[] c2 =s2.toLowerCase().toCharArray();
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		String s1 = "Silent";
		String s2 = "Listen";
		
		boolean ans = anagram(s1,s2);
		System.out.println(ans);

	}

}
