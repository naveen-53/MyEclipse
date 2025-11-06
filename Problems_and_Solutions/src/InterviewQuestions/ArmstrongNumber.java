package InterviewQuestions;

import java.util.Scanner;

/*								"Armstrong Number"
 * 
 * 153 --> (1^3)+(5^3)+(3^3)  -->  1+125+27  -->  153 --> this is Armstrong Number
 */

public class ArmstrongNumber {
	
	public void armstrongNumber(int n) {
		int reminder, armstrong=0 , original=n;
		while(original!=0) {
			reminder=n%10;
			armstrong+=(reminder*reminder*reminder);
			original/=10;
		}
		if(armstrong==n) { System.out.println(n+" is a Armstrong Number"); }
		
		else { System.out.println(n+" is not a Armstrong Number"); }
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:  ");
		int n = sc.nextInt();
		
		ArmstrongNumber an = new ArmstrongNumber();
		an.armstrongNumber(n);
		
		sc.close();
		
		
	}

}
