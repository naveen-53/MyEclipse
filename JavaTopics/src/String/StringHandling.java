package String;

public class StringHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Sachin";
		System.out.println(s.toUpperCase());//SACHIN
		System.out.println(s.toLowerCase());//sachin
		System.out.println(s); //Sachin
		
		System.out.println(s.trim());//Sachin (trim removes whitespace before)
		System.out.println(s.startsWith("Sa")); //true
		System.out.println(s.endsWith("n"));  // true
		System.out.println(s.charAt(0)); 
		System.out.println(s.charAt(3));
		
		String s1=new String("Sachin");
		String s3=s1.intern(); //converting the string object s into s2
		System.out.println(s3);
		
		int a=10;
		String s4=String.valueOf(a);    // 10 -> "10"
		System.out.println(s4+10);
		
		String s9="Java is a programming Language. Java is a platform";
		String replaces9= s9.replace("Java", "Javaa");
		System.out.println(replaces9);
		
		String s10="Hello";
		String s11="Java";
		String s12="How are you";
		String s13=s10.concat(s11).concat(s12);
		System.out.println(s13);
		
		String a1="Hello"+"Java";
		System.out.println(a1);
		
		System.out.println(s10.equals(s11));
	}

}
