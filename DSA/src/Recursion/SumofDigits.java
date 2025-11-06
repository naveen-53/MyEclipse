package Recursion;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12348;
		System.out.println(sumofDigits(n));
	}
	static int sumofDigits(int n) {
		if(n==0) {
			return 0;
		}
		return (n%10) + sumofDigits(n/10);
	}

}
