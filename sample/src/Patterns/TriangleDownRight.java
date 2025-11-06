package Patterns;

import java.util.Scanner;

public class TriangleDownRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows: ");
		row=sc.nextInt();
		
		for(i=1;i<=row;i++) {
			for(j=row;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
