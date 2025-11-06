package StringsProblem;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s ="aaaabbcdee"; 
		String ans = "";
		for(int i=0;i<s.length();i++) {
			if(!ans.contains(s.charAt(i)+"")) {
				ans+=s.charAt(i);
			}
		}
		System.out.println(ans);

	}

}
