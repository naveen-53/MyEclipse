package ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a= {1,2,3};
			System.out.println(a[10]);

		}
		catch(Exception e) {
			System.out.println("Something went Wrong "+e);
		}
		
		finally {
			System.out.println("Try Catch Completed");
		}

	}

}
