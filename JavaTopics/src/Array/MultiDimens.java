package Array;

import java.util.Scanner;

public class MultiDimens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[100][100];
		int rows,col,i,j;
		System.out.println("Enter no.of Rows:");
		rows=sc.nextInt();
		System.out.println("Enter no.of Rows:");
		col=sc.nextInt();
		
		for(i=0;i<rows;i++) {
			for(j=0;j<col;j++) {
				System.out.print("Enter the Array element: ");
				a[i][j]=sc.nextInt();
				
			}
		}
		
		System.out.println("Display 2D Array elements:");
		
		for(i=0;i<rows;i++) {
			for(j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
