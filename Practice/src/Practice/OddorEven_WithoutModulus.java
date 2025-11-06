package Practice;

public class OddorEven_WithoutModulus {

	public static void main(String[] args) {
		
		int n= 3;
		if((n&1)==0) {
			System.out.println(n+" is a Even");
		}
		else
			System.out.println(String.format("%.2f", n)+" is a Odd");
			// the format method denotes digits of a number

	}

}
