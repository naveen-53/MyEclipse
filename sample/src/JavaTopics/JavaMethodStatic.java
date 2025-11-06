package JavaTopics;

public class JavaMethodStatic {
	static int b=9;     // static variable
	
	
	static void myStaticMethod() {
		System.out.println("Static method can be called without objects.");
	}
	public void myPublicMethod() {
		System.out.println("Public method will be used with objects.");
	}

	public static void main(String[] args) {
		
		String a="Hello";      //instance variable

		myStaticMethod(); // directly calling static method without object
		
		JavaMethodStatic jms = new JavaMethodStatic();
		jms.myPublicMethod();  // calling public method using object
		
		System.out.println("The Value of String: "+a);
	

	}

}
