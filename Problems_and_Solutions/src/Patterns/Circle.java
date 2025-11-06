package Patterns;

public class Circle {

	public static void printCircle(int radius) {
        for (int i =1; i <= radius; i++) {
        	for(int j=1;j<=radius-i;j++) {
        		System.out.print("  ");
        	}
        	System.out.print("* ");
        	for(int j=1;j<2*i;j++) {
        		System.out.print("  ");
        	}
        	System.out.print("* ");
        	System.out.println();
        }
        for(int i=1;i<=radius;i++) {
        	for(int j=1;j<i;j++) {
        		System.out.print("  ");
        	}
        	System.out.print("* ");
        	System.out.println();
        }
            
    }
	
	public static void main(String args[]) {
		printCircle(3);  
	}

}
