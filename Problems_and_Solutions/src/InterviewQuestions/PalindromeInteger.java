package InterviewQuestions;

/*									" Palindrome "
 * 
 * 121 --> reverse of 121 --> 121 --> it is a palindrome
 * 153 --> reverse of 153 --> 351 --> it is not a palindrome
 */

import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int reverse=0;
		int original=n;
		
		while(n!=0) {            
			int reminder=n%10;    
			reverse=(reverse*10)+reminder;
			n=n/10;
		}
		if(original==reverse) {
			System.out.println(original+" is a palindrome ");
		}
		else
			System.out.println(original+" is not a palindrome ");
		
		sc.close();
		

	}

}
