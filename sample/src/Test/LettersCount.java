package Test;

import java.util.Scanner;

public class LettersCount {

	public static void main(String[] args) {
		int letters=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence:");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				letters++;
			}
		}
		System.out.println("No.of letters in the Sentence :"+letters);
		
		sc.close();
	}

}
