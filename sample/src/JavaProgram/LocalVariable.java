package JavaProgram;

public class LocalVariable {
	
	void add() {
		int a=10 , b=5;
		System.out.println("Addition: "+(a+b));
	}

	public static void main(String[] args) {
		
		//declare a local variable
		//int var1=20;
		//this variable is local to this main method
		//System.out.println("Printing the Value "+var1);
		
		LocalVariable lv = new LocalVariable();
		lv.add();
	}
	
	

}
