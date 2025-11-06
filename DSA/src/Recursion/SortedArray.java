package Recursion;

public class SortedArray {

	static boolean isSorted(int[] a, int index) {
		if(index== a.length-1) {
			return true;
		}
		return a[index]<a[index+1] && isSorted(a, index+1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,8,5};
		System.out.println(isSorted(a,0));

	}

}
