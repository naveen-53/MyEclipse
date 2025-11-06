package OOPs;

/* Here, you cannot instantiate the Employee class, but you can instantiate the Salary 
 * using this instance you can access the all three fields and 7 methods of shown below
 * 
 */

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary("Mohan","Namakkal",3, 3600.00);
		Employee e = new Salary("John","Boston, MA",2,2400.00);
		System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();
		System.out.println("\n Call mailCheck using Salary reference --");
		e.mailCheck();

	}

}
