package Patterns;

/*
 			*          *
 			**        **
 			***      ***
 			****    ****
 			*****  *****
 			************
 			************
 			*****  *****
 			****    ****
 			***      ***
 			**        **
 			*          *

 */

public class ButterflyStar {

	public static void main(String[] args) {
		int rows = 6;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=2*rows;j++) {
				if(j>i && j<=2*rows-i) {
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=rows;i>0;i--) {
			for(int j=1;j<=2*rows;j++) {
				if(j>i && j<=2*rows-i) {
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
