package Collections;

import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
		
		String players[]= {"Virat","Dhoni","Sachin"};
		
		System.out.println("The array is "+Arrays.toString(players));
		
		//converting array into collections
		List<String> playersList =Arrays.asList(players);
		System.out.println("Converted Array element is  "+playersList);
	}

}
