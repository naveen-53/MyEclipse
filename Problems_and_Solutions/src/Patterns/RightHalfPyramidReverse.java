package Patterns;

/*
 		******
 		*****
 		****
 		***
 		**
 		*
 */

public class RightHalfPyramidReverse {

	public static void main(String[] args) {
		int rows =6;
		for(int i=rows;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
