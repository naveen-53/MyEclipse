package Patterns;

/*
  		1 
  		1 2 
  		1 2 3 
  		1 2 3 4 
  		1 2 3 4 5 
  		1 2 3 4 5 6
   
 */

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		int rows = 6;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
