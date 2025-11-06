package Java_8_Features;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
	int price;
	
	Demo(int price){
		System.out.println("Hello Naveen : "+price);
	}
	
	public  void show(int value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		//directly given
		al.forEach(System.out::println);
		
		Contract c = a-> System.out.println(a);
		c.display(10);
		
		//on static method
		Contract c1 = new Demo(10)::show;
		//c1.display(20);
		
		
		// on constructor
		Contract c3 = Demo::new;
		c3.display(10000);
		
		
		
		
		
		
		
	}


}
