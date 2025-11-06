package Test;

import java.util.Scanner;

public class PrimeorNot {
	public void checkPrime(int n) {
		int temp=0;
		if(n==0 || n==1) {  
			System.out.println(n+" is not a prime number."); 
		}
		else
			for(int i=2;i<n;i++) {
				if(n%i==0) { 
					temp++; 
					break; 
				}	
			}
		if(temp==1) {  
			System.out.println(n+" is not a prime number."); 
		}
		else    
			System.out.println(n+" is a prime number.");	
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		PrimeorNot p =new PrimeorNot();
		p.checkPrime(n);
		
		sc.close();


	}
}
