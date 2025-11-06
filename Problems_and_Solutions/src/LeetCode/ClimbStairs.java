package LeetCode;

import java.util.Scanner;

/*
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. 
 * In how many distinct ways can you climb to the top?
 */

public class ClimbStairs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Steps: ");
		int n= sc.nextInt();  //10
		
		int []arr = new int[n+1];
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2;i<n+1;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		System.out.println(arr[n]);
		
		for(int i : arr) {
			System.out.println(i+" ");
		}
	
		sc.close();
		
		
		

		

	}

}
