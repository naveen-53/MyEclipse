package Java_8_Features.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Stream_Practice_Numbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,8,22,10,4,22,18,18,5));
		
		//Find the second highest number in a list using streams.
		
		al.stream().distinct()
		.sorted(Collections.reverseOrder())
		.skip(1).limit(1).forEach(System.out::println);
		
		al.stream().map(n -> n*n).forEach(n->System.out.println(n));;
		
	}

}
