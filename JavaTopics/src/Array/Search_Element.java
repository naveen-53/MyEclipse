package Array;

import java.util.Scanner;

public class Search_Element {

	public static void main(String[] args) {
		
		int temp=0,i=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter no.of elemnts you want in array ");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter all element:");
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();	
		}
		System.out.println("Enter search element:");
		int x=in.nextInt();
		for(i=0;i<n;i++){
			if(a[i]==x) {
				temp=1;
				break;
			}
			else {temp=0;}
		}
		
		if(temp==1) {
			System.out.println("Element found at position: "+(i+1));	
		}
		else
			System.out.println("Element not found");
		in.close();
		
	}
}
