package Algorithms;

import java.util.Arrays;

public class SelectionSort {
	
	static void selection(int[] a) {
		for(int i=0;i<a.length;i++) {
			int last = a.length-1-i;
			int max = max(a,0,last);
			swap(a,last,max);
		}
	}
	static void swap(int[] a, int first, int second) {
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}
	static int max(int[] a, int start, int end) {
		int max=start;
		for(int i=start;i<=end;i++) {
			if(a[max]<a[i]) {
				max=i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		int[] arr = {2,4,5,1,3};
		
		selection(arr);
		System.out.println(Arrays.toString(arr));

	}

}
