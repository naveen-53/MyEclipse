package OOPs;

public class Salary extends Employee {
	private double salary;
	public Salary(String name, String address, int number,double salary) {
		super(name,address,number);
		setSalary(salary);
	}
	public void mailCheck() {
		System.out.println("Within mailCheck of Salary class ");
		System.out.println("Mailing a check to"+getName()+" with salary "+salary);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double newSalary) {
		if(newSalary>=0.0) {
			salary=newSalary;
		}
	}
	public double computePay() {
		System.out.println("computing salary pay for "+getName());
		return salary/52;
	}
	
	public static void main(String args[]) {
		Salary s =new Salary("Naveen","Salem",1234,78000);
		s.mailCheck();
	}

}

