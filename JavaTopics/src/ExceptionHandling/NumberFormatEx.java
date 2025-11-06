package ExceptionHandling;

public class NumberFormatEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num=Integer.parseInt("hi");
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception");
		}

	}


}
