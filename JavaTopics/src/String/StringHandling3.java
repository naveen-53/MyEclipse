package String;

public class StringHandling3 {

	public static void main(String[] args) {
		int a=10;
		String s= String.valueOf(a);  // passing int into string
		System.out.println(s+10);
		
		
		StringBuffer sb = new StringBuffer("Hai");
		//append()
		sb.append("Java");
		System.out.println(sb);
		
		//insert()
		sb.insert(1,"Advanced Java");
		System.out.println(sb);
		
		//delete()
		sb.delete(1, 5);
		System.out.println(sb);
		
		//reverse()
		sb.reverse();
		System.out.println(sb);
		System.out.println("----------------------------------------------");
		
		
		StringBuffer sbr= new StringBuffer("SLA");
		
		//conversion from StringBuffer object to String Object
		String str=sbr.toString();
		
		//Creating StringBuilder using Constructor
		StringBuilder sbl = new StringBuilder(str);
		System.out.println(sbl);
		
		
		
		
		
	}

}
