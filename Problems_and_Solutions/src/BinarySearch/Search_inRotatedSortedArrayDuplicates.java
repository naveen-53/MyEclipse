package BinarySearch;

public class Search_inRotatedSortedArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,3,3,1};
		System.out.println(peakElement(arr));

	}
	
	static int peakElement(int[] arr){
        int start=0, end=arr.length-1;
        
        while(start<end){
            int mid=start+(end-start)/2;
            if(end>mid && arr[mid]>arr[mid+1]){    return mid;	}

            if(start<mid && arr[mid]<arr[mid-1]){    return mid-1;    }

            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
            	
            	if(arr[start]>arr[start+1]) {	return start;}
            	start++;
            	
            	if(arr[end]<arr[end-1]) {	return end;}
            	end--;
            }
            else if(arr[start]<arr[mid] || arr[start]==arr[mid] && arr[end]>arr[mid]) {	start=mid+1;	}
            
            else {	end=mid-1;	}
        }
        return -1;   
    }

}
