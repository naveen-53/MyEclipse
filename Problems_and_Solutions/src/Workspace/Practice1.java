package Workspace;

public class Practice1 {
	
	static String reverse(String s) {
		if(s.length()==1) {
			return s.charAt(0)+"";
		}
		return reverse(s.substring(1))+s.charAt(0);	
	}
	public static void main(String[] args) {
		
		String s = "123456780019";
		System.out.println(reverse(s));

	}

}
