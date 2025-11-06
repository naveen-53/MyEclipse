package Test;

import java.util.Scanner;

public class VowelsandConsonants {

	public static void main(String[] args) {
		
		int vowels=0, consonants=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s =sc.next();
		for(int i=0;i<s.length();i++) {
			char c =s.toLowerCase().charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowels++;
			}
			else
				consonants++;
		}
		System.out.println("No.of Vowels: "+vowels);
		System.out.println("No.of Consonants: "+consonants);
		
		sc.close();

	}

}
