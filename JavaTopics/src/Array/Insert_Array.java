package Array;

import java.util.Scanner;

public class Insert_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elemnts you want in array ");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		System.out.println("Enter all element:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();	
		}
		
		System.out.println("Enter the position:");
		int pos=sc.nextInt();
		System.out.println("Enter the insert element:");
		int x=sc.nextInt();
		
		for(int i=(n-1);i>=(pos-1);i--) {
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		
		System.out.println("After Inserting:");
		
		for(int i=0;i<=n;i++) {
			System.out.print(a[i]+", ");	
		}
		
		sc.close();
		

	}

}
