package Collections;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

enum h {orange,apple};

public class HashSetProgram {
	public static void main(String[] args) {
		//int count[]= {21,22,23,24,25,26};
		Set<Integer> set = new HashSet<Integer>();
		Set<h> set1;
		set1=EnumSet.of(h.orange,h.apple);
		System.out.println(set1);
		
		set.add(27);
		set.add(28);
		set.add(29);
		set.add(30);
		System.out.println(set);
		
		
		set.remove(30);
		System.out.println("After Removing "+set);
		
		int check=26;
		//contains to check the element in the set
		System.out.println("Contains "+set.contains(check));
		
		System.out.println("----------------------------------");
		
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+",");
			System.out.println();
		}
		
	}

}
