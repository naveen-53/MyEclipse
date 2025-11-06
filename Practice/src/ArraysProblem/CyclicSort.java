package ArraysProblem;

import java.util.Arrays;

public class CyclicSort {
	
	static void cyclic(int[] a) {
		int i=0;
		while(i<a.length-1) {
			int correct = a[i]-1;
			if(a[i]==i+1) {
				i++;
			}else {
				swap(a,correct,i);
			}
		}
	}

	private static void swap(int[] a, int correct, int i) {
		int temp = a[correct];
		a[correct] = a[i];
		a[i] = temp;
		
	}

	public static void main(String[] args) {
		int[] a = {5,4,1,2,3,7,6};
		System.out.println(Arrays.toString(a));
		cyclic(a);
		System.out.println(Arrays.toString(a));

	}

}
