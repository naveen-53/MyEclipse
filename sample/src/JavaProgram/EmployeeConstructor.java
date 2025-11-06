package JavaProgram;

public class EmployeeConstructor {
	int EmpId;
	String Name;

	public EmployeeConstructor() {
		EmpId=9109;
		
	}
	public EmployeeConstructor(int id, String name) {
		EmpId=id;
		Name=name;
	}
	void setValue(int id) {
		EmpId=id;
	}
	
	public static void main(String args[]) {
		EmployeeConstructor ec = new EmployeeConstructor();
		System.out.println(ec.EmpId);
		
		EmployeeConstructor ec1 = new EmployeeConstructor(8109,"Naveen");
		System.out.println(ec1.EmpId);
		System.out.println(ec1.Name);
	}

}




