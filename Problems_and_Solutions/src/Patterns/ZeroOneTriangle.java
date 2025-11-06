package Patterns;

/*
 
1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1

 */

public class ZeroOneTriangle {

	public static void main(String[] args) {
		int rows =6;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++) {
				if((i+j)%2 == 0) {
					System.out.print(1+" ");
				}
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}

	}

}
