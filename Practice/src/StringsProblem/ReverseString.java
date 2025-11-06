package StringsProblem;

public class ReverseString {

	public static void main(String[] args) {
		String s = "hello";
		
		String rev = reverse2(s);
		
		System.out.println(rev);

	}

	static String reverse1(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	
	static String reverse2(String s) {
		String rev ="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
		
	}

}
