package BinarySearch;

// link --> https://leetcode.com/problems/search-in-rotated-sorted-array/description/

// time complexity must be O(log n).

public class Search_InRotatedSortedArray_33 {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int target = 0;
		
		System.out.println(search(arr,target));

	}
	static int search(int[] arr, int target) {
        int peak = peakElement(arr);
        if(peak==-1){   return binarySearch(arr,target,0,arr.length-1); }

        if(target==arr[peak]){   return peak;}

        if(target>=arr[0]){  return binarySearch(arr,target,0,peak); }
        else{   return binarySearch(arr,target,peak+1,arr.length-1);}
    }
	
    static int peakElement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(end>mid && arr[mid]>arr[mid+1]){    return mid;	}

            if(start<mid && arr[mid]<arr[mid-1]){    return mid-1;    }

            if(arr[mid]<=arr[start]){   end=mid-1;  }
            else{   start=mid+1;   }
        }
        return -1;   
    }
    
    static int binarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]<target){    start = mid+1;  }
            else if(arr[mid]>target){	end = mid-1;   }
            else{   return mid;}
        }
        return -1;
    }

}
