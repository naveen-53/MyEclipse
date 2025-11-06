package Patterns;

/*
		1 2 3 4 5 6 
		1 2 3 4 5 
		1 2 3 4 
		1 2 3 
		1 2
		1 
 
 */

public class NumberDecreasingPyramid {

	public static void main(String[] args) {
		int rows = 6;
		
		for(int i=rows;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
