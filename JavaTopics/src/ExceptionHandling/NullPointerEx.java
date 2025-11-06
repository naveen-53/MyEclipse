package ExceptionHandling;

public class NullPointerEx {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String s= null;
			System.out.println(s.charAt(0));
		}
		catch(NullPointerException e){
			System.out.println("Null Pointer Exception");
		}
		finally {
			System.out.println("Hi");
		}

	}

}
