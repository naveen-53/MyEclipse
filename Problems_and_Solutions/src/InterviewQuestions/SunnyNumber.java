package InterviewQuestions;

import java.util.Scanner;

/*                             "SUNNY NUMBER"
 * 8 --> 8+1 --> 9 --> sqrt(9) --> 3 --> it is a perfect sqrt --> 8 is a sunny number
 * 
 * logic:  given number = n;
 * 		   N=n+1;
 * 		   Math.sqrt(N); if it was a perfect square root then n will be a Sunny Number
 */

public class SunnyNumber {
	
	public void sunnyNumber(int n) {
		int nextN= n+1;
		double perfectSqrt=Math.sqrt(nextN);
		//System.out.println(perfectSqrt);
		int sqrt= (int) perfectSqrt;
		
		if(perfectSqrt==sqrt) { System.out.println(n+" is Sunny Number"); }
		else {System.out.println(n+" is not a Sunny Number"); }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		SunnyNumber s = new SunnyNumber();
		s.sunnyNumber(n);
		
		sc.close();
		

	}

}
