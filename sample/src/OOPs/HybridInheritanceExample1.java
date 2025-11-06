package OOPs;

class HumanBody{
	public void displayHuman() {
		System.out.println("About Human Body");
	}
}
interface Male{           //interface
	public void show();    // only declaration not definition
}
interface Female{
	public void show();
}



public class HybridInheritanceExample1 extends HumanBody implements Male,Female{
	
	public void show() {
		System.out.println("Implementation of show method in both male and female");
	}
	public void displayHybrid() {
		System.out.println("Method about hybrid inheritance");
	}
	

	public static void main(String[] args) {
		
		HybridInheritanceExample1 obj = new HybridInheritanceExample1();
		System.out.println("Implementation of Hybrid Inheritance in Java ");
		System.out.println("-----------------------------------------------");
		obj.show();
		obj.displayHybrid();
		
	}

}
