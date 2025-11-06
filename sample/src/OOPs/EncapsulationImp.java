package OOPs;

class Programmer{
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
}
public class EncapsulationImp {

	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		p.setName("Naveen");
		System.out.println("Name is "+p.getName());
		

	}

}
