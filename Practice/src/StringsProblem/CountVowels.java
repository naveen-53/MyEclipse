package StringsProblem;

public class CountVowels {

	public static void main(String[] args) {
		String s = "aeioubca";
		String check = "aeiou";
		int vowels=0, consonant =0;
		for(int i=0;i<s.length();i++) {
			if(check.contains(s.charAt(i)+"")) {vowels++;}
			else	consonant++;
		}
		
		System.out.println("Vowels = "+vowels+"\tConsonants = "+consonant);
	}

}
