package Collections;

//key,values pair(one obj used as key and another was value)

import java.util.HashMap;
import java.util.Map;

public class HashmapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("Welcome", 1);
		hm.put("Wel", 2);
		hm.put("come", 3);
		System.out.println("Hashmap Values "+hm);
		
		HashMap<String,Integer> hm1 = new HashMap<String,Integer>();
		hm1.put("Hi", 1);
		hm1.put("Hai", 2);
		hm1.put("Hello", 3);
		System.out.println("Hashmap Values "+hm1);
		
		//put all values in second map
		hm1.putAll(hm);
		System.out.println("Hashmap Values "+hm1);

//changing the element
		hm.put("Welcome to Java world", 1);
		System.out.println("Updated Hashmap Values "+hm);
		
		//removing values
		hm.remove("Wel");
		System.out.println("Updated Hashmap Values after remove "+hm);
		
		//checking the key is present , if it is print the value
		// map traversal using for-each loop
		for(Map.Entry<String,Integer> e: hm.entrySet()) {
			System.out.println("Key "+e.getKey()+" value "+e.getValue());
		}
		System.out.println("------------------------------------------------");
		
		if(hm.containsKey("Welcome")) {
			//mapping
			Integer a = hm.get("Welcome");
			//printing the value for corresponding keys
			System.out.println("Value for key welcome is "+a);
		}
		
		//Access the element 
		System.out.println("Access the element "+hm.get("come"));
		
		//get the size of hash map
		System.out.println("Size of the map "+hm.size());
		
		

	}

}
