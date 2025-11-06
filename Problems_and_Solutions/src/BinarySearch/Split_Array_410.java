package BinarySearch;

public class Split_Array_410 {

	public static void main(String[] args) {
		int[] arr = {7,2,5,10,8};
		int m=2;
	}
	
	static int splitArray(int[] nums,int m) {
		
		int start=0, end=0;
		for(int i=0;i<nums.length;i++) {
			start= Math.min(start,nums[i]);
			end+=nums[i];
		}
		
		while(start<end) {
			int mid=start +(end-start)/2;
			
			int pieces=1, sum=0;
			
			for(int num :nums) {
				if(sum+num>mid) {
					sum=num;
					pieces++;
				}
				else {
					sum+=num; 
				}
			}
			if(pieces>m) {
				start=mid+1;
			}
			else {
				end=mid;
			}
		}
		return end;
		
	}

}
