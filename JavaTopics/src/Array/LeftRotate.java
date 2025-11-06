package Array;

import java.util.Arrays;

public class LeftRotate {

	public static void main(String[] args) {
		int []array = {1,2,3,4,5};
		int l=1;
		int r=l-(2*l);
		int d=r+array.length;
		d=d%array.length;
		
		for(int j=0;j<d;j++) {
			int temp=array[0];
			for(int i=0;i<array.length-1;i++) {
				array[i]=array[i+1];
			}
			array[array.length-1]=temp;
			System.out.println(Arrays.toString(array));
		}
	}

}
