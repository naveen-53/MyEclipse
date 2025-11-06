package ExceptionHandling;

public class IllegalArgumentEx {
	
	static void print(int age) {
		if(age>=18) {
			System.out.println("Eligible for vote");
		}
		else
			throw new IllegalArgumentException("Not eligible for vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(19);
		print(14);

	}

}
