package Java_8_Features.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_String_practice {

	public static void main(String[] args) {
		
		ArrayList<String> s = new ArrayList<>(
				Arrays.asList("Naveen","Nandhini","Rajavel","Darmik","abcdefgh","Naveen","madam"));
		
		//Given a list of strings, find the longest string.
		String s1 =s.stream().max(Comparator.comparing(String::length)).orElse(null);
		System.out.println(s1);
		
		//Group a list of strings by their length
		Map<Integer, List<String>> l = s.stream().collect(Collectors.groupingBy(n -> n.length()));
		System.out.println(l);
		System.out.println(l.get(6));
		
		
		//count character in a String
		String str ="aabbc cc deffg";
		Map<Character,Long> count = str.chars()
									.mapToObj(c -> (char) c)
									.collect(Collectors.groupingBy(value->value,Collectors.counting()));
		
		System.out.println(count);
		
		System.out.println("------------------------------------------------------------");
		
		String n = "naveen";
		char[] c = n.toCharArray();
		
		System.out.println(n.chars().mapToObj(x -> (char)x).count());
		
		System.out.println(s.stream().filter(w -> w.startsWith("N")).count());
		
		
		s.stream().max(Comparator.comparing(String::length));
		
		s.stream().filter(w -> new StringBuilder(w).reverse().toString().equals(w)).forEach(System.out::println);;
	}

}
