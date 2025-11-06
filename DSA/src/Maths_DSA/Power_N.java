package Maths_DSA;

public class Power_N {

	public static void main(String[] args) {
	
		int n = 3;
		int power = 6;
		int ans =1;
		
		while(power>0) {
			if((power & 1) == 1) {
				ans*=n;
			}
			n*=n;
			power = power>>1;
		}
		
		System.out.println(ans);
		System.out.println(n);

	}

}
