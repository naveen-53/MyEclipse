package StringsProblem;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountChar {

	public static void main(String[] args) {
		String s = "dmadamds";
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++) {
			if(hm.containsKey(s.charAt(i))){
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else 	
				hm.put(s.charAt(i), 1);
		}
		
		System.out.println(hm);

	}

}
