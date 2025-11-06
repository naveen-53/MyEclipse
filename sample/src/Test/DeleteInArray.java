package Test;

import java.util.Scanner;

public class DeleteInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size=sc.nextInt();
		int []a = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter Value "+(i+1)+" : ");
			a[i]=sc.nextInt();
		}
		
		
		int pos=3;
		for(int i=pos-1;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		for(int i=0;i<a.length-1;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
