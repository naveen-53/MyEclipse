package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListImp2 {

	public static void main(String[] args) {
		
		ArrayList <Integer> a = new ArrayList <Integer>();
		
		//adding the elements at the specific position
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		System.out.println(a);
		
		ArrayList <Integer> lista = new ArrayList <Integer>();
		
		lista.add(600);
		lista.add(700);
		lista.add(800);
		
		//copying two lists
		Collections.copy(a,lista);
		System.out.println(a);
		System.out.println(lista);
		
		//Shuffle the list 
		System.out.println("Before Shuffle: "+lista);
		Collections.shuffle(lista);
		System.out.println("After Shuffle: "+lista);
		
		//reverse the list
		System.out.println("Before Reverse: "+lista);
		Collections.reverse(lista);
		System.out.println("After Reverse: "+lista);
		
		//swaps the list
		System.out.println("Before Swap: "+lista);
		Collections.swap(lista, 0, 2);
		System.out.println("After Swap: "+lista);
		
		System.out.println("-------------------------------------------");
		
		ArrayList <String> listString = new ArrayList <String>();
		listString.add("Red");
		listString.add("Blue");
		listString.add("Green");
		listString.add("Yellow");
		listString.add("Black");
		
		ArrayList <String> listString2 = new ArrayList <String>();
		listString2.add("Red");
		listString2.add("Blue");
		listString2.add("Green");
		listString2.add("Violet");
		listString2.add("Orange");
		
		//add all the arrayList
		ArrayList <String> listString3 = new ArrayList <String>();
		listString3.addAll(listString);
		listString3.addAll(listString2);
		System.out.println(listString3);
		
		
		//comparing two arrayList
		ArrayList <String> listCompare = new ArrayList <String>();
		for(String i : listString) {
			listCompare.add(listString2.contains(i)?"Yes":"No");
		}
		System.out.println(listCompare);
		
		
		
		
		
		
		
		
		
	}

}
