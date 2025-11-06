package Practice;

public class AddNumsWithoutOperator {

	public static void main(String[] args) {
		
		int a =13, b=5;
		
		while(b!=0) {
			int c = a&b;
			a = a^b;
			b = c << 1;
		}
		int ans = a;
		
		System.out.println(ans);

	}

}
