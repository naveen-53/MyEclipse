package Patterns;

/*

 
     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *


 */

public class DiamondStar {

	public static void main(String[] args) {
		int rows = 6;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");		
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=rows-1;i>0;i--) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
