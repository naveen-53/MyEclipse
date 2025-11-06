package BinarySearch;


public class Position_in_InfiniteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,6,7,10,11,12,15,18,23,30};
		int target = 10;
		
		System.out.println(position(arr,target));

	}
	
	static int position(int[] arr, int target) {
		int start=0;
		int end=1;
		while(target>arr[end]) {
			int temp=end+1;
			end=end+(end-start+1)*2;
			start=temp;
		}
		return binarySearch(arr,target,start,end);
	}
	
	static int binarySearch(int[] arr,int target,int start,int end) {
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}

}
