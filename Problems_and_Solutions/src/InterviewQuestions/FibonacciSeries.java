package InterviewQuestions;

/*							" FibonacciSeries "
 *  0,1,1,2,3,5,8,13,21,........
 */

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter how much you want in fibonacci series: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		int t1=1, t2=1;
		arr[0]=t1;
		arr[1]=t2;
		
		for(int i=2;i<n;i++) {
			int nextTerm=t1+t2;
			t1=t2;
			t2=nextTerm;
			arr[i]=nextTerm;
		}
		
		System.out.println("Fibonacci Series: "+Arrays.toString(arr));
		sc.close();
		}

}
