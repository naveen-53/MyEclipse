package Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapImp {

	public static void main(String[] args) {
		LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>();
		lhm.put("one", "hai");
		lhm.put("two", "hey");
		
		System.out.println(lhm);
		System.out.println("Getting Key Value: "+lhm.get("one"));
		System.out.println("Size of HashMap: "+lhm.size());
		System.out.println("Is HashMap is Empty: "+lhm.isEmpty());
		System.out.println("Contains key two: "+lhm.containsKey("two"));
		System.out.println("Contains key hey: "+lhm.containsValue("hey"));
		System.out.println("delete the element one: "+lhm.remove("one"));
		System.out.println(lhm);
		

	}

}
