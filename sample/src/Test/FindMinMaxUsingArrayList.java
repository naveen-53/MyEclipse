package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMinMaxUsingArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no.of elements: ");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the number "+(i+1)+" : ");
			int a=sc.nextInt();
			al.add(a);
		}
		int max=Collections.max(al);
		int min=Collections.min(al);
		System.out.println(al);
		System.out.println("Minimum Value: "+min);
		System.out.println("Maximum Value: "+max);
		
		sc.close();
	}

}
