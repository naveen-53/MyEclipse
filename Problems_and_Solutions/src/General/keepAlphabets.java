package General;

public class keepAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="(())abc()def(";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}
		System.out.print(s.length());
		System.out.print(sb);
	}

}
