package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumbers {
	
	static List<Integer> findAllMissingNumbers(int[] a){
		cyclic(a);
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(a[i]!= i+1) {
				al.add(i+1);
			}
		}
		return al;
		
	}
	static void cyclic(int[] a) {
		int i=0;
		while(i<a.length-1) {
			int correct = a[i]-1;
			if(a[correct] == a[i]) {
				i++;
			}
			else {
				swap(a, i,correct);
			}
		}
	}
	static void swap(int[]a , int first, int second) {
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}

	public static void main(String[] args) {
		
		int[ ] a = {4,3,2,7,8,2,3,1};
		
		System.out.println(findAllMissingNumbers(a));
		

	}

}
