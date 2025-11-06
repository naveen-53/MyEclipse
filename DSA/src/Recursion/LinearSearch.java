package Recursion;

import java.util.ArrayList;

public class LinearSearch {
	
	static ArrayList<Integer> findElement(int[] a, int target, int index, ArrayList<Integer> al){
		if(index== a.length-1) {
			return al;
		}
		if(a[index]== target) {
			al.add(index);
		}
		return findElement(a, target, index+1, al);
	}
	
	static ArrayList<Integer> findElement1(int[] a, int target, int index){
		ArrayList<Integer> al = new ArrayList<>();
		if(index== a.length-1) {
			return al;
		}
		if(a[index]== target) {
			al.add(index);
		}
		ArrayList<Integer> ans = findElement1(a, target, index+1);
		
		al.addAll(ans);
		return al;
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,4,5};
		
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.println(findElement1(a, 4, 0));

	}

}
