package Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int target = 1;
		System.out.println(search(a, target, 0, a.length-1));

	}
	static int search(int[] a , int target, int s, int e) {
		
		if(s>e) {
			return -1;
		}
		int mid = s+(e-s)/2;
		
		if(a[mid] == target) {
			return mid;
		}
		
		if(target< a[mid]) {
			return search(a,target,s,mid-1);
		}
		
		return search(a,target,mid+1,e);
		
	}

}
