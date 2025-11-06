package Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class QueueMethodTypes {

	public static void main(String[] args) {
		
		Queue<String> q1 = new LinkedList<>();
		q1.add("apple");
		q1.add("mango");
		q1.add("orange");
		System.out.println("List of queue "+q1);
		
		
		//remove the element from the front
		String front=q1.remove();
		System.out.println("Updated queue "+front);
		
		//peek at the end of the queue
		String peeked =q1.peek();
		System.out.println("List of queue "+q1);
		System.out.println("\n--------------------------------------------------");
		
		Deque<String> deque = new LinkedList<String>();
		deque.add("kitkat");
		System.out.println(deque+"\n");
		deque.addLast("DairyMilk");     // add at last
		System.out.println(deque+"\n");
		deque.addFirst("FiveStar");           // add at first
		System.out.println(deque+"\n");
		deque.remove("kitkat");               //remove element
		System.out.println(deque+"\n");
		deque.push("MilkyBar");                //add at first
		System.out.println(deque+"\n");
		deque.offer("Munch");                //add at last
		System.out.println(deque+"\n");
		deque.offerFirst("Bounty");         // add at first
		System.out.println(deque+"\n");
		
		
		
		
		
	}

}
