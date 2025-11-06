package LeetCode;

import java.util.Collections;
import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,2,1,2,4};
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			if(!hm.containsKey(a[i])) {
				hm.put(a[i], 1);
			}
			else {
				hm.put(a[i], hm.get(a[i])+1);
			}	
		}
		
		System.out.println(hm);
		int maxValue = Collections.max(hm.values());
		
		for(int key : hm.keySet()) {
			if(hm.get(key)== maxValue) {
				System.out.println("Majority Element is "+key);
				break;
			}
		}
		
			
	}

}
