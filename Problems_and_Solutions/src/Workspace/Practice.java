package Workspace;

public class Practice {

	public static void main(String[] args) {
		
		String s = "3[a]4[bc]";
		int len = s.length();
		int index=0;
		int count=0;
		StringBuilder ans = new StringBuilder();
		
		StringBuilder sb = new StringBuilder();
		
		while(index<len) {
			
			
			if(Character.isDigit(s.charAt(index))) {
				count=s.charAt(index)-'0';
				index++;
			}
			
			else if(s.charAt(index)=='[') {
				index++;
			}
			else if(Character.isAlphabetic(s.charAt(index))) {
				sb.append(s.charAt(index));
				index++;
			}
			else if(s.charAt(index)==']') {
				for(int i=0;i<count;i++) {
					ans.append(sb);
					
				}
				sb.setLength(0);
				count=0;
				index++;
			}
		}
		System.out.println(ans);

	}

}
