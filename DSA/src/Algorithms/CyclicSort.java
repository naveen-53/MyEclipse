package Algorithms;

import java.util.Arrays;

public class CyclicSort {
	
	static void cyclic(int[] a) {
		int i=0;
		while(i<a.length-1) {
			int correct = a[i]-1;
			if(a[correct]==a[i]) {
				i++;
				
			}
			else {
				int temp = a[correct];
				a[correct] = a[i];
				a[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,5,2,1,4};
		
		cyclic(a);
		System.out.println(Arrays.toString(a));
	}

}
