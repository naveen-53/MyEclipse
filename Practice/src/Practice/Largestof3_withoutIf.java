package Practice;

public class Largestof3_withoutIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=20, c=30;
		
		int third = a>b ? (a>c ? a : c) : ( b>c ? b: c);

		System.out.println(third);
	}

}
