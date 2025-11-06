package InterviewQuestions;

import java.util.Scanner;

/*                      "Tech Number"
 * 
 * 2025 --> 20+25 --> 45 --> 45^2 --> 2025 --> this is tech number
 */

public class TechNumber {
	
	public void techNumber(int n) {
		
		String str = Integer.toString(n);
		if(str.length()%2==0) {
			int center = str.length()/2;
			int firstHalf= Integer.parseInt(str.substring(0, center));
			int secondHalf = Integer.parseInt(str.substring(center));
			int numTech = (firstHalf+secondHalf)*(firstHalf+secondHalf);
			
			if(numTech==n) {
				System.out.println(n+" is  a Tech Number");
			}
			else
				System.out.println(n+" is not a Tech Number");
		}	
		else 
			System.out.println(n+" is not a Tech Number");
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		
		TechNumber tn = new TechNumber();
		tn.techNumber(n);
		
		sc.close();
		
		

	}

}
