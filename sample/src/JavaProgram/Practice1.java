package JavaProgram;

class Infosys{
	int empId=9109;
	String empName="Naveen";
	
}
class IT extends Infosys{
	String name="Developer";
}
class Accounts extends Infosys{
	String name="Accounts Manager";
}
class HR extends Infosys{
	String name="HR";
}
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IT i = new IT();
		Accounts a = new Accounts();
		HR h = new HR();
		
		System.out.println(i.empName+" is a "+i.name+" and ID is "+i.empId);
		System.out.println(a.empName+" is a "+a.name+" and ID is "+a.empId);
		System.out.println(h.empName+" is a "+h.name+" and ID is "+h.empId);

	}

}
