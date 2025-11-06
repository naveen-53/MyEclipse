package Hard;

import java.util.Arrays;

/*
 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
	You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
	
	Input: nums = [3,4,-1,1]
	Output: 2
	Explanation: 1 is in the array but 2 is missing.
 */

public class FirstMissingPositive_41 {
	
	static int firstMissingPositive(int[] a) {
		cyclicSort(a);
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=i+1) {
				return i+1;
			}
		}
		return a.length+1;
	}
	
	static void cyclicSort(int[] a) {
		int i=0;
		while(i<a.length) {
			int correct = a[i]-1;
			if(a[i]>0 && a[i]<a.length && a[correct]!=a[i]) {
				swap(a,i,correct);
			}
			else {
				i++;
			}
		}
	}
	static void swap(int[] a, int first, int second ) {
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}

	public static void main(String[] args) {
		
		int[] a = {3,4,-1,1};
		
		System.out.println(firstMissingPositive(a));

	}

}
