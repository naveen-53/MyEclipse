package LeetCode;

public class Power {
	
	public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        return pow(x,N);
        
    }
    private double pow(double x, long n){
        if(n==0){
            return 1;
        }
        double half=pow(x,n/2);
        if(n%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }

	public static void main(String[] args) {
		
		double x=2.1;
		int n=10;
		
		Power p = new Power();
		double result = p.myPow(x, n);
		
		System.out.println(x+" power of "+n+" is "+result);

	}

}
