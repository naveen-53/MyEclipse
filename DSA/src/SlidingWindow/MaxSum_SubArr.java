package SlidingWindow;

public class MaxSum_SubArr {

	public static void main(String[] args) {
		
		int[] arr = {-1,2,3,3,4,5,-1};
		int k=4;
		int l=0,r=k-1,	maxSum=0;
		while(r<arr.length) {
			int sum = 0;
			for(int i=l;i<=r;i++) {
				sum+=arr[i];
			}
			l++;
			r++;
			maxSum = Math.max(maxSum, sum);
		}
		
		System.out.println(maxSum);
		
		
	}

}

