package Patterns;

/*
 
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 

 */
public class NumberTriangle {

	public static void main(String[] args) {
		int rows=6;
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
