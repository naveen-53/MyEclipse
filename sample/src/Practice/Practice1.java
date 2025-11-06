package Practice;

/*
 * i/p  -->  a=[1,2,3] , b=[4,5,6]        o/p  -->  [5,7,9]
 * 
 *     123+456 = 579 --> [5,7,9]
 */

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
	private static int arrayToNum(int[] arr) {
		int num =0;
		for(int i=0;i<arr.length;i++) {
			num=(num*10)+arr[i];
		}
		return num;
	}
	
	private static int[] numToArray(int num) {
		String numStr = Integer.toString(num);
		int arr[] = new int[numStr.length()];
		
		for(int i=0;i<numStr.length();i++) {
			arr[i]= numStr.charAt(i)-'0';
		}
		return arr;
		
	}
	public static int[] getInput(Scanner sc) {
		
		System.out.println("Enter the size of array: ");
		int size =sc.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter value "+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Values of array 1: ");
		int a[]= getInput(sc);
		System.out.println("----------------------------------");
		System.out.println("Values of array 2: ");
		int b[]= getInput(sc);
		System.out.println("----------------------------------");
		
		int num1 = arrayToNum(a);
		int num2 = arrayToNum(b);
		
		int ans = num1+num2;
		int num[]= numToArray(ans);
		
		System.out.println("The Answer is "+Arrays.toString(num));
		
		
		

	}

}
