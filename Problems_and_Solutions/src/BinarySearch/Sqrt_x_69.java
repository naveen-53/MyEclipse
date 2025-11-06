package BinarySearch;

// link --> https://leetcode.com/problems/sqrtx/?envType=problem-list-v2&envId=binary-search


public class Sqrt_x_69 {
	
	static int mySqrt(int x) {
        if(x<2){    return x;}
        
        int left =1, right = x/2;
        int ans =0;
        
        while(left<=right){
            int mid = left +(right-left)/2;
            long square = (long) mid*mid;
            
            if(square == x){return mid;    }

            else if(square>x){	right=mid-1;}
            
            else{
                ans=mid;
                left = mid+1;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		int n1 = 9;
		System.out.println(mySqrt(n1));
		int n2 =8;
		System.out.println(mySqrt(n2));

		int n3 = 143;
		System.out.println(mySqrt(n3));


	}

}
