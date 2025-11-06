package LeetCode;

import java.util.Scanner;

/*
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
 * The returned integer should be non-negative as well.
 */

public class Sqrt {
	public static int sqrt(int n) {
		int left=0,right=n,mid=0;
		while(left<=right) {
			mid=(left+right)/2;         //32
			if(mid*mid<n) {             //32*32 <64  not satisfy
				left=mid+1;
			}
			else if(mid*mid>n) {        //32*32 > 64 satisfy
				right=mid-1;            // right 31
			}
			else 
				return mid;
		}
		return right;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		System.out.println(sqrt(n));
		
		sc.close();
		

	}

}
