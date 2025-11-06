package Recursion.SubsetSubseq;

public class Skip_A_inString {
	
	static String skip_apple(String up) {
		if(up.isEmpty()) {
			return up;
			
		}
		
		char ch = up.charAt(0);
		if(up.startsWith("apple")) {
			return skip_apple(up.substring(5));
		}
		else {
			 return ch+ skip_apple(up.substring(1));
		}
	}
	static String skip_a(String p,String up) {
		if(up.isEmpty()) {
			return p;
		}
		
		char ch = up.charAt(0);
		if(ch == 'a') {
			return skip_a(p,up.substring(1));
		}
		else {
			 return skip_a(p+ch,up.substring(1));
		}
	}
	

	public static void main(String[] args) {
		
		String str = "abbapplecaacd";
		System.out.println(skip_a("",str));

	}

}
