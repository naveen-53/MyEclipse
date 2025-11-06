package Practice;

import java.util.Arrays;
import java.util.HashMap;

public class Coding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> hm = new HashMap<>();
		for(char i='A';i<='Z';i++) {
			int digit=i-'A'+1;
			hm.put(i, digit);
		}
		System.out.println(hm);
		String name="NAVEEN";
		
		int a[] = new int[name.length()];
		
		for(int i=0;i<name.length();i++) {
			a[i]=hm.get(name.charAt(i));
		}
		
		System.out.println("numbers for Alphabets :"+Arrays.toString(a));
		
		

	}

}
