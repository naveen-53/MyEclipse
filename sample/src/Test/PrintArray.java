package Test;

import java.util.Scanner;

// 07/03/2025

public class PrintArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size=sc.nextInt();
		int []array = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter Value "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		
		System.out.println("The Elemnts in Array: ");
		for(int i=0;i<size;i++) {
			
			System.out.print(array[i]+" ");
		}
		

	}

}
