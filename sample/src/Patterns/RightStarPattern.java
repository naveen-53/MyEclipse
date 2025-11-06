package Patterns;

public class RightStarPattern {

	public static void main(String[] args) {
		
		int i,j,rows=6;
		
		for(i=1;i<rows;i++) {             
			for(j=rows;j>i+1;j--) {       
				System.out.print(" ");	
			}
			for(j=0;j<i;j++) {             
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
		
		for(i=rows;i>0;i--) {
			for(j=0;j<i-1;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=rows-i;j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		
		
		
		
		
		

	}

}
