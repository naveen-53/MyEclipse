package BinarySearch;

//ceiling number means target number or smallest element which is greater than target


public class CeilingNumber {
	
	static int ceilingNum(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		if(target>arr[arr.length-1]) {
			return -1;
		}
		while(start<=end) {
			int mid = start+ (end-start)/2;
			if(arr[mid]==target) {
				return arr[mid];
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return arr[start];
	}

	public static void main(String[] args) {
		int[] arr = {2,3,5,9,14,16,18};
		int target = 1;
		System.out.println(ceilingNum(arr,target));
	}

}
