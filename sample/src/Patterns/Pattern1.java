package Patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		//row=sc.nextInt();
		
		for(i=1;i<=row;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(j=row*2-1;j>i;j--) {       
				System.out.print(" ");	
			}
			System.out.println();
		}
		for(i=1;i<=row-1;i++) {
			for(j=row;j>i;j--) {
				System.out.print("*");
			}
			for(j=row*2-1;j>i;j--) {       
				System.out.print(" ");	
			}
			System.out.println();
		}
		sc.close();
	}

}
