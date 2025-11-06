package Java_8_Features;

@FunctionalInterface
public interface InterfaceDemo {
	public int test(int a , int b);
	
	default void print() {
		System.out.println("Hi I'm default method");
	}
	
	static void print1() {
		System.out.println("Hi I'm static method");
	}

}
