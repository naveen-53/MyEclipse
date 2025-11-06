package Array;

import java.util.ArrayList;
import java.util.Stack;


public class DuplicatePrint {
	
	static void fibo(int n) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int[] a = {1,2,3,2,4,1,5};
		char c;
		
		int dup =0;
		ArrayList<Integer> s = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(!s.contains(a[i])) {
				s.add(a[i]);
			}
			else
				dup++;	
		}
		
		System.out.println(c);
		System.out.println(s + " "+dup);*/
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		System.out.println(s.search(10));
	}

}
