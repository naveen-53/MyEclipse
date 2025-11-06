package Test;

import java.util.Scanner;

public class SubtractArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int[][]a = new int[3][3];
		int[][]b = new int[3][3];
		int[][]c = new int[3][3];
		System.out.println("Enter 1st Matrix Values:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("Enter element "+i+j+" : ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("Enter 2nd Matrix Values:");
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print("Enter element "+i+j+" : ");
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("Subtraction of two matrices");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
		sc.close();


	}

}
