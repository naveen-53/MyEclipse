package InterviewQuestions;

/*							"Peterson Number"
 * 
 *  145 --> 1!+4!+5! --> 1+24+120 --> 145 --> this is Peterson Number
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PetersonNumber {
	
	public static int factorial(int a) {
		int fact=1;
		for(int i =a;i>0;i--)  { fact *=i; }
		return fact;
	}
	
	public void petersonNumber(int n) {
		ArrayList<Integer> digits = new ArrayList<>();
		int original=n, peterson=0;
		while(n!=0) {
			digits.add(n%10);
			n/=10;
		}
		System.out.println("The Digits are "+digits);
		
		for(int i : digits) { peterson+=factorial(i); }
		
		if(original==peterson) { System.out.print(original+" is a peterson number"); }
		
		else { System.out.print(original+" is not a peterson number");}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		PetersonNumber p = new PetersonNumber();
		p.petersonNumber(n);
		
		sc.close();

	}
	

}
