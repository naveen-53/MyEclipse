package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DupicatesInArrayandArrayList {
	
	public static void duplicatesinArray(int []a) {
		System.out.print("The Duplicates are ");
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
	}
	
	public static void duplicatesinArrayList(ArrayList<Integer> al) {
		HashSet<Integer> unique = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		
		for(int n : al) {
			if(!unique.add(n)) {
				duplicates.add(n);
			}
		}
		System.out.println(duplicates);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int size=sc.nextInt();
		int []array = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter Value "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		System.out.println("Array :"+Arrays.toString(array));
		
		System.out.print("Duplicates in Array :");
		duplicatesinArray(array);
		System.out.println();
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int num : array) {
			al.add(num);
		}
		System.out.println("ArrayList : "+al);
		
		System.out.print("Duplicates in ArrayList :");
		duplicatesinArrayList(al);

	}

}
