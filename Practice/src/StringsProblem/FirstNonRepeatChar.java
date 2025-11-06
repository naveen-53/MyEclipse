package StringsProblem;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		String s = "dmadamds";
		int temp=0;
		for(int i=0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i)) != s.lastIndexOf(s.charAt(i))) {
				System.out.println(s.charAt(i));
				temp = 1;
				break;
			}
		}
		if(temp==0) {
			System.out.println("there is no non repeating char");
		}

	}

}
