package Recursion;

public class RotatedBinarySearch {
	
	static int search(int[] a, int target, int s, int e) {
		if(s>e) {
			return -1;
		}
		int m= (s+e)/2;
		if(a[m] == target) {
			return m;
		}
		
		if(a[s] <= a[m]) {
			if(target>=a[s] && target<=a[m]) {
				return search(a,target,s,m-1);
			}
			else {
				return search(a,target,m+1,e);
			}
		}
		
		if(target >= a[m] && target <= a[e]) {
			return search(a,target,m+1,e);
		}
		return search(a,target,s,m-1);
	}

	public static void main(String[] args) {
		int[] arr = {5,6,7,8,9,1,2,3};
		System.out.println(search(arr,8,0,arr.length-1));

	}

}
