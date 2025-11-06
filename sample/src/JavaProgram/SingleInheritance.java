package JavaProgram;

class Car {
	protected String brand="TATA";
	public void horn() {
		System.out.println("The car is horning the road");
	}

}
class SingleInheritance extends Car {          //implementing
	String model="Indica";          //properties
	
	public static void main(String args[]) {
		SingleInheritance mycar=new SingleInheritance();
		//call the horn method from SingleInheritance
		mycar.horn();
		System.out.println(mycar.brand+" "+mycar.model);
		
	}
}