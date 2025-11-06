package Test;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[][]jag = new int[4][6];
		for(int i=0;i<jag.length;i++) {
			for(int j=0;j<jag[i].length;j++) {
				System.out.print("Enter element "+i+j+" : ");
				jag[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<jag.length;i++) {
			for(int j=0;j<jag[i].length;j++) {
				System.out.print(jag[i][j]+" ");	
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
