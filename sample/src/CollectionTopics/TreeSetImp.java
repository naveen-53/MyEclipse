package CollectionTopics;

import java.util.TreeSet;

public class TreeSetImp {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(0);
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(7);
		System.out.println("Before elements from Treeset: "+ts);
		System.out.println("pollFirst from Treeset: "+ts.pollFirst());
		System.out.println("pollLast  from treeset: "+ts.pollLast());
		System.out.println("Before elements from Treeset: "+ts);
		

	}

}
