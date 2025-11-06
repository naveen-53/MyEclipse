package LeetCode;

/*
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 */

import java.util.Arrays;

public class PlusOne {
	
	public static int[] plusOne(int[] a) {
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]<9) {
				a[i]++;
				return a;
			}
			else {
				a[i]=0;
			}
		}
		a = new int[a.length+1];      //old a = {9,9,9} -->  it will be a = {0,0,0,0}
		a[0]=1;
		return a;
	}

	public static void main(String[] args) {
		int []a = {9,9,9};
		System.out.println(Arrays.toString(plusOne(a)));
		
		

	}

}
