package Recursion;

public class ReverseNum {
	
	static int reverse(int n){
		if(n==0) {
			return -1;
		}
		return ((n%10) + reverse(n/10))*10;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1824;
		System.out.println(reverse(n));
	}

}
