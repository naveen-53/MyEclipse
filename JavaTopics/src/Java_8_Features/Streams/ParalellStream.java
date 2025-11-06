package Java_8_Features.Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class ParalellStream {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		int x = al.parallelStream().map(n -> n*n).reduce(0,(a,b)-> a+b);
		
		System.out.println(x);
		
		int y = al.parallelStream().mapToInt(n->n.intValue()).map(n->n*n).max().orElse(0);
		
		System.out.println(y);

	}

}
