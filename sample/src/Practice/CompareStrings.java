package Practice;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1=sc.nextLine();
		System.out.println("Enter String 2 : ");
		String s2=sc.nextLine();
		if(s1.toLowerCase().equals(s2.toLowerCase())) {
			System.out.println("Two Strings are Equals");
		}
		else
			System.out.println("Two Strings are not Equals");
		
		
		sc.close();

	}

}
