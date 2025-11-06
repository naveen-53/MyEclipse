package Collections;

import java.util.Hashtable;

public class HashTableImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable <Integer,String> ht= new Hashtable<Integer,String>();
		
		//storing values
		ht.put(10, "ten");
		ht.put(20, "twenty");
		ht.put(30, "thirty");
		//displaying the hash table
		System.out.println("Hash tables "+ht);
		//checking the values
		System.out.println("checking the values in hash map table "+ht.contains("ten"));
		//update the values
		ht.put(10, "ten only");
		System.out.println("updated Hash map tables "+ht);
		//remove item in hash table
		ht.remove(10);
		System.out.println("Hash tables after remove "+ht);
		
		//check the particular key value is present
		System.out.println("check the particular key value is present "+ht.containsKey(20));
		System.out.println("updated Hash map tables "+ht);
		
		
		

	}

}
