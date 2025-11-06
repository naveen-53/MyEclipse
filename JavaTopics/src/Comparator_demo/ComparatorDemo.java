package Comparator_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<String> com = new Comparator<>(){

			@Override
			public int compare(String s1, String s2) {
				if(s1.length()>s2.length()) {
					return 1;
					
				}
				else {
					return -1;
				}
			}
			
		};
		ArrayList<String> al = new ArrayList<>();
		
		al.add("naveen");
		al.add("a");
		al.add("powerhouse");
		al.add("Deva");
		
		System.out.println(al);
		
		Collections.sort(al,com);
		
		System.out.println(al);
		
		

	}

}
