package Collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList <Integer> a = new ArrayList <Integer>();
		
		//adding the elements at the specific position
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		System.out.println(a);
		
		
		System.out.println(a.get(3));
		
		a.remove(3);
		System.out.println("After removing element "+a);
		
		a.set(1, 110);
		System.out.println("Printing the element "+a);
		
		
	}

}
