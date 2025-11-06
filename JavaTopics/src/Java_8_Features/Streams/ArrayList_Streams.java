package Java_8_Features.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayList_Streams {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(
				Arrays.asList(1,2,3,4,5,6,50,10,40,30,18));
		
		al.stream().filter(n-> n%2!=0).map(n->n*n).forEach(System.out::println);
		
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		al2.addAll(al);
		
		List<Integer> aa=al.stream().map(n-> n*n).collect(Collectors.toList());
		System.out.println(aa);
		
		int a =al.stream().mapToInt(Integer::intValue).max().orElse(Integer.MIN_VALUE);
		
		double b = al.stream().mapToInt(x-> x.intValue()).average().orElse(0);
		
		List<Integer> lis = al.stream().filter(n -> n%10==0).collect(Collectors.toList());
		System.out.println(lis);
		
		
		
		
	}

}
