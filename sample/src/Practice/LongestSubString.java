package Practice;

public class LongestSubString {

	public static void main(String[] args) {
		String s = "abcddbefgakj";
		String su = null;
		int n=s.length();
		for(int i=0;i<n;i++) {
			su=s.substring(i+1, n);
			char [] c= su.toCharArray();
			for(int j=0;j<c.length;j++) {
				for(int k=1;k<c.length-1;k++) {
					if(c[j]==c[k]) {
					su="1";
					}
				}
				
			}
		}
		System.out.println(su);

	}

}
