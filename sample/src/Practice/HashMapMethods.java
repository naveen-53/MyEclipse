package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(1, 10);
		hm.put(2, 20);
		hm.put(3, 30);
		hm.put(4, 40);
		hm.put(5, 50);
		hm.put(6, 60);
		hm.put(7, 70);
		hm.put(8, 80);
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
		System.out.println(hm.containsKey(5));
		System.out.println(hm.containsValue(100));
		System.out.println(hm.get(5));
		
		for(Map.Entry<Integer, Integer>  entry : hm.entrySet() ) {
			System.out.println("Key: "+entry.getKey()+"\tValue: "+entry.getValue());
		}
		System.out.println("--------------------------------------------------");
		
		System.out.println("\t\t forEach() in HashMap");
		//forEach() method
		hm.forEach((key,value)->System.out.println(key+" : "+value));
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("\t\t Iterator in HashMap");
		//Iterator using with entrySet()
		Iterator<Map.Entry<Integer, Integer>> i = hm.entrySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("--------------------------------------------------"); 
		
		//Iterator using with keySet()
		Iterator<Integer> j = hm.keySet().iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		System.out.println("--------------------------------------------------");
		
		//Iterator using with values()
		Iterator<Integer> k = hm.values().iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		
		
		
		
		
	

	}

}
