package InterviewQuestions;


import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter how much you want in prime numbers : ");
		int n = sc.nextInt();

		for(int i=2;i<n;i++) {          
			int count =0;               
			for(int j=2;j<i;j++) {      
				if(i%j==0) {            
					count=1;            
				}
			}
			if(count==0) {
				al.add(i);
			}
		}
		System.out.println("Prime Numbers: "+al);
		
		sc.close();
	}

}
