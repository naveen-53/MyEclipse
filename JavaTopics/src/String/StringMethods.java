package String;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World ";
		String s1 = " Hello World ";
		
		System.out.println(s1);
		System.out.println(s.length());
		System.out.println(s.trim());
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s1.trim());
		System.out.println(s1.length());
		System.out.println(s1.trim().length());
		System.out.println(s.substring(6, 9));
		int count =0;
		for(int i=s1.trim().length();i>=0;i--) {
			System.out.print(s1.charAt(i));
			
		}System.out.println();
		System.out.println(count);
		
		String [] str = s1.split(" ");
		for(String a : str) {
			System.out.print(a+",");
		}
		System.out.println();
		System.out.println(str[str.length-1]);
		
		//System.out.println(Arrays.toString(str));
	}

}
