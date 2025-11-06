package Recursion;

import java.util.ArrayList;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		System.out.println(fibonacci2(8));
	}
	static int fibonacci(int n) {
		if(n<2) {
			return n;
		}
		//System.out.println(n);
		
		return fibonacci(n-1) + fibonacci(n-2);
		
	}
	
	static ArrayList<Integer> fibonacci2(int n) {
		
		ArrayList<Integer> list = new ArrayList<>();
		if(n==0) {return list;}
		if(n==1) {list.add(0);	return list;}
		if(n==2) {list.add(0);	list.add(1);	return list;}
		
		list = fibonacci2(n-1);
		
		
		int size = list.size();
		int next  = list.get(size-1) + list.get(size-2);
		list.add(next);		
		return list;
		
		
		
	}

}
