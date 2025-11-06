package Practice;

public class CheckPrime {

	public static void main(String[] args) {
		int n=9;
		boolean isPrime = n>1;
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println(n+" is a prime");
		}else
			System.out.println(n+" is not a prime");

	}

}
