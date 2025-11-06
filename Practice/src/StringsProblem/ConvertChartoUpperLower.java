package StringsProblem;

public class ConvertChartoUpperLower {
	
	static String convertFull(String name) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<name.length();i++) {
			
			char ch = name.charAt(i);
			
			if(ch>='A' && ch<='Z') {
				sb.append((char) (ch+32));
			}
			else if(ch>='a' && ch<='z') {
				sb.append((char) (ch-32));
			}
			else
				sb.append(ch);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String name = "naveen";
		String low="";
		
		for(int i=0;i<name.length();i++) {
			low+= (char) (name.charAt(i)-32);
		}
		
		System.out.println(low);
		
		
	}

}
