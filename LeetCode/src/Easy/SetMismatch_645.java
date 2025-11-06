package Easy;

import java.util.Arrays;

/*
 * Question Link - https://leetcode.com/problems/set-mismatch/description/
 */
public class SetMismatch_645 {
	
	static int[] mismatch(int[] a) {
		int i=0;
		while(i<a.length) {
			int correct = a[i]-1;
			if(a[i]!=a[correct]) {
				swap(a,i,correct);
			}
			else {
				i++;
			}
		}
		for(i=0;i<a.length;i++) {
			if(a[i] !=i+1) {
				return new int[] {a[i],i+1};
			}
		}
		return new int[] {-1,-1};
	}
	static void swap(int[] a,int first,int second) {
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,2,4};
		
		System.out.println(Arrays.toString(mismatch(nums)));
		
	}
}
