package Array;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,1,2,1,3,2,1};                // 2,3,4,5,1
		//int[] arr = Arrays.copyOf(a, a.length+1);
		for(int k=0;k<6;k++) {
			int temp = a[0];
			for(int i=1;i<a.length;i++) {
				a[i-1] =a[i];
			}
			a[a.length-1] = temp;
			
			//System.out.println(Arrays.toString(a));
		}
		
		System.out.println(Arrays.toString(a));
		
		
		//System.out.println(Arrays.toString(arr));
	}

}
