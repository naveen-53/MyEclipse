package Collections;

import java.util.ArrayList;

public class ArrayListImp {

	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList <Integer>();
		a.add(10);
		System.out.println(a);
		
		//adding the elements at the specific position
		a.add(1,100);
		System.out.println(a);
		
		//updating values
		a.set(1, 110);
		System.out.println("Printing the element "+a);
		
		//removing element using index
		a.remove(1);
		System.out.println("After removing element "+a);
		
		//removing all the element
		a.removeAll(a);
		System.out.println("After removing all element "+a);
		
		int array[]= {1,1,2,2,3,3,4,4,5,8};
		
		ArrayList <Integer> ans = new ArrayList <Integer>();
		for(int i : array) {
			if(!ans.contains(i)) {
				ans.add(i);
			}
		}
		System.out.println(ans);
		
		
		
		
		
		
		
		
	}

}
