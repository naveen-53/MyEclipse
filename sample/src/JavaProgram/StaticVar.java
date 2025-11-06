package JavaProgram;

//JVM runs the static method
//Static method does not any access to instance var
//this and super keyword cannot be used in static method

public class StaticVar {
	static int a=10;
	int b=20;
	void SimpleDisplay() {
		System.out.println(a); // static variable
		System.out.println(b); // instance variable
	}
	//declaration of static method
	static void StaticDisplay() {
		//in static method only static variable will be accessed
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub...................................,
		StaticVar sv=new StaticVar();
		sv.SimpleDisplay();
		sv.StaticDisplay();

	}

}
