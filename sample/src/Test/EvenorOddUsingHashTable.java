package Test;

import java.util.Hashtable;
import java.util.Scanner;

public class EvenorOddUsingHashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no.of elements: ");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the number "+(i+1)+" : ");
			int a=sc.nextInt();
			if(a%2==0) {
				ht.put(a, "even");
			}
			else
				ht.put(a, "odd");
		}
		System.out.println("Even or Odd : "+ht);
		
		sc.close();
		
		
		
		

	}

}
