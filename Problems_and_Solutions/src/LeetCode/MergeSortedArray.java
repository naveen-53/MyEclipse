package LeetCode;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int [] a = {1,2,3,0,0,0,0,0};
		int[] b = {2,5,6};
		
		int m=3,n=3;
		
		MergeSortedArray obj = new MergeSortedArray();
		obj.merge(a, m, b, n);
		for (int num : a) {
            System.out.print(num + " ");
        }
	}
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // Pointer for nums1   2
        int j = n - 1;        // Pointer for nums2   2
        int k = m + n - 1;    // Pointer for the end of merged array in nums1  5

        // Merge from the end
        while (i >= 0 && j >= 0) {    	   // 2,2		2,1		2,0		1,0			1,null		0,null
            if (nums1[i] > nums2[j]) {     // 3>6		3>5		3>2		2>2			2>null		1>null
                nums1[k--] = nums1[i--];   // 							
            } else {					   // k=5		k=4		k=3		k=2			k=1			k=0
                nums1[k--] = nums2[j--];   // 6			5,6		3,5,6	2,3,5,6		2,2,3,5,6	1,2,2,3,5,6
            }
        }

        // If any elements remain in nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        
	}
}


