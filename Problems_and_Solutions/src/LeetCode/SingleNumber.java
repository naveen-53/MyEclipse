package LeetCode;

/*
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * return without duplicate
 */

public class SingleNumber {

	public static void main(String[] args) {
		
		int[] a = {4,1,2,1,2};
		int result=0;
		for(int i=0;i<a.length;i++) {
			result^=a[i];
		}
		System.out.println("Single number is "+result);

	}

}

// 0100 ^ 0001 = 
//
//
//

