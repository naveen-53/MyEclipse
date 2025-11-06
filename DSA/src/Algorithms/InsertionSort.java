package Algorithms;

import java.util.Arrays;

public class InsertionSort {
	
	static void insertion(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j>0;j--) {
				
				if(arr[j]<arr[j-1]) {
					
					int temp =arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
				else{
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] a = {1,5,3,4,1,2,6};
		
		System.out.println( "Before Sort: "+Arrays.toString(a)+"\n");
		
		insertion(a);
		
		System.out.println("After Sort"+Arrays.toString(a));

	}

}
