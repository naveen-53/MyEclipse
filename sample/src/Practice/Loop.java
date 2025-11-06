package Practice;

public class Loop {
	
	static boolean isPrime(int n) {
		
		for(int i=2;i<n;i++) {
			if(n==1 || n==0) {
				return false;
			}
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		
		for(int i=2;i<100;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
			
		}

	}

}
