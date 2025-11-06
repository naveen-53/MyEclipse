package Patterns;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		
		int row,i,j,space=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no.of rows: ");
		row=sc.nextInt();
		space=row-1;
		for(i=1;i<=row;i++) {
			for(j=1;j<=space;j++) {
				System.out.print(" ");
			}
			space--;
			for(j=1;j<=2*i-1;j++) {          //to print * in even position
				System.out.print("*");
			}
			System.out.println();
		}
		space=1;
		for(i=1;i<=row-1;i++) {
			for(j=1;j<=space;j++) {               //between rows
				System.out.print(" ");
			}
			space++;
			for(j=1;j<=2*(row-i)-1;j++) {       //incrementing rows
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
