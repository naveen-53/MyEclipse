package StringsProblem;

public class Palindrome {

	public static void main(String[] args) {
		String s = "madam";
		
		if(palindrome(s)) {
			System.out.println(s+" is a palindrome");
		}else
			System.out.println(s+" is not a palindrome");

	}

	private static boolean palindrome(String s) {
		int start=0, end=s.length()-1;
		while(start<=end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
