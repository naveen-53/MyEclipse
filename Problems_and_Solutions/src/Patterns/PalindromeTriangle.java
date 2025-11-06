package Patterns;

/*
          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6 
 
 
 */

public class PalindromeTriangle {

	public static void main(String[] args) {
		int rows = 6;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" "+" ");
			}
			
			for(int j=i;j>0;j--) {
				System.out.print(j+" ");
			
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j+" ");
			
			}
			System.out.println();
		}

	}

}
