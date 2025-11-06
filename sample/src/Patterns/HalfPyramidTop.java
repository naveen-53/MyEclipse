package Patterns;

import java.util.Scanner;

public class HalfPyramidTop {
	public static void main(String[] args) {
		
		int row,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		row=sc.nextInt();
		
		for(i=1;i<=row;i++) {
			for(j=i;j<=row-1;j++) {
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++) {          
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
