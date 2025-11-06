package BinarySearch;

import java.util.Arrays;


/*
 *  link -> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
 */

public class SearchFirstAndLast_34 {

	public static void main(String[] args) {
		int arr[] = {5,7,7,8,8,10};
		int target= 8;
		System.out.println(Arrays.toString(searchRange(arr,target)));

	}
	
	static int[] searchRange(int[] nums, int target) {
        int[] a= new int[2];
        a[0] = search(nums,target,true);
        a[1] = search(nums,target,false);
        return a;
        
    }
    static int search(int[] nums,int target,boolean firstStartIndex){
        int ans=-1;
        int start=0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(nums[mid]<target){	start=mid+1;	}
            
            else if(nums[mid]>target){ end=mid-1; }
            
            else{
                ans=mid;
                
                if(firstStartIndex){	end=mid-1;	}
                
                else{	start=mid+1; }   
            }
        }
        return ans;
    }

}
