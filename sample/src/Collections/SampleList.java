package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class SampleList {

	public static void main(String[] args) {
		
		LinkedList <String> list = new LinkedList<String>();
		list.add("Ram");
		list.add("Priya");
		list.add("Ajay");
		list.add("Malini");
		
		//traversing list thru iterator
		Iterator <String> it =list.iterator();
		while(it.hasNext()) {
			if(it.next()=="Ram") {
				System.out.println("End");
				break;
			}
			System.out.println(it.next());
		}
		

	}

}
