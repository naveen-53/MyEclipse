package Test;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.print("Enter element "+(i+1)+" : ");
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter search element: ");
		int x = sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				System.out.println(x+ " was found at position "+(i+1));
				break;
			}
		}
		
		sc.close();

	}

}
