package Practice;

import java.util.Stack;

public class StackMethods {
	
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<>();
		st.add(10);
		st.add(20);
		
		st.add(30);
		st.add(40);
		st.add(50);
		st.add(60);
		System.out.println(st);
		st.push(50);
		System.out.println(st);
		st.pop();
		st.pop();
		System.out.println(st);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		
		System.out.println(st);
		System.out.println(st.capacity());
		
		System.out.println(st.size()); // it will return size of stack
		
		System.out.println(st.search(10));
		// it will returns the position from top
		
		System.out.println(st.elementAt(1));
		System.out.println(st.firstElement());
		System.out.println(st.lastElement());
		System.out.println(st.isEmpty());
		System.out.println(st.empty());
		
		
	}
}
