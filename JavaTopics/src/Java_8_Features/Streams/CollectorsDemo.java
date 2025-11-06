package Java_8_Features.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		
		List<Integer> li = al.stream().filter(n -> n%2==0).collect(Collectors.toList());
		
		System.out.println(li);
		
		String s = "naveen";
		
		Map<Character, Long> lhm = s.chars().mapToObj(n -> (char)n)
								.collect(Collectors.groupingBy(value -> value,LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(lhm);

	}

}
