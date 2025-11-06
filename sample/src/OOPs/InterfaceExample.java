package OOPs;

interface In1{
	final int a=10;
	void display();
	
}
public class InterfaceExample implements In1 {
	
	public void display() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		
		InterfaceExample i = new InterfaceExample();
		i.display();
		//System.out.println(i.a);
		System.out.println(In1.a);
		

	}

}
