package InterviewQuestions;

import java.util.ArrayList;
import java.util.Scanner;

/*              					" Neon Number "
 * 
 * 9 --> 9^2 --> 81 --> 8+1 --> 9 --> it is neon number
 */

public class NeonNumber {
	
	public int neon(int n) {
		int square = n*n;
		int dup = square;
		int add =0;
		ArrayList<Integer> al = new ArrayList<>();
		while(dup!=0) {
			al.add(dup%10);
			dup/=10;
		}
		for(int i : al) { add +=i; }
		return add;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		NeonNumber nn = new NeonNumber();
		int num = nn.neon(n);
		
		
		if(num==n) { System.out.println(n+" is a neon number"); }
		
		else System.out.println(n+" is not a neon number");

	}

}
