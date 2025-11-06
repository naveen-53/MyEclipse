package InterviewQuestions;

public class FibonacciSeriesEven {

	public static void main(String[] args) {
		int n=4;
		
		int[] fib = new int[2*n+1];
		
		fib[0]=0;
		fib[1]=1;
		int sum=0;
		for(int i=2;i<=2*n;i++) {
			fib[i]=fib[i-1]+fib[i-2];
			
			if(i%2==0) {
				sum+=fib[i];
			}
		}
		
		System.out.println(sum);

	}

}
