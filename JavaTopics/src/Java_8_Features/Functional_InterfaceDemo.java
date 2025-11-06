package Java_8_Features;

import java.util.function.Predicate;

public class Functional_InterfaceDemo {

	public static void main(String[] args) {
		
		InterfaceDemo i = (a,b) -> a+b;

		System.out.println( i.test(10,20));
		
		Predicate<Integer> p  = no -> no>60;
		
		System.out.println(p.test(61));
		
		

	}
	
	

	
	

}
