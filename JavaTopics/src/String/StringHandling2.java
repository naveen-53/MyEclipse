package String;

import java.util.Arrays;

public class StringHandling2 {

	public static void main(String[] args) {
		
		String s5="Hai i am string using new";
		int result=s5.indexOf('i');
		System.out.println(result);
		
		String text="Java is a programming Language";
		
		String[] resultany=text.split("");
		
		for(String strany: resultany) {
			System.out.println(strany+"");
		}
		
		//split -- 1. regex(div the string)
		        // 2. no of resulting subStrings
		String vowels="a::e::i::o:e";
		//splitting the string "::"
		//storing the result in array
		
		String[] resultvowel=vowels.split("::");
		System.out.println("Result "+Arrays.toString(resultvowel));
		
		String str34="hai bat and ball";
		System.out.println(str34.substring(4,6));

	}

}
