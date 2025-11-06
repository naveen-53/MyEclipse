package Java_8_Features.Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamsDemo {

	public static void main(String[] args) {
		int[] arr = {5,3,6,1,2,7,4};
		
		IntStream s =Arrays.stream(arr);
		
		s.filter(n -> n%2==0).map(n -> n*2)
		.sorted().forEach(System.out::println);
		
		int c = Arrays.stream(arr).filter(n -> n%2==0).map(n -> n*2)
				.sorted().reduce(0,(a,b) -> a+b);
		
		System.out.println(c);
		
		int a =(int) Arrays.stream(arr).average().orElse(0);
		
		int max = Arrays.stream(arr).max().orElse(0);
		
		System.out.println(max);

	}

}
