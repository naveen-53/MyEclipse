package Test;

import java.util.Scanner;

public class WordsCount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String s=sc.nextLine();
		
		String [] words = s.trim().split(" ");
		System.out.println(words.length);
		
		sc.close();
	}

}
