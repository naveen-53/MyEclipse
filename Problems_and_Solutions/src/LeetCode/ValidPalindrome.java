package LeetCode;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		
		s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
		int i=0,j=s.length()-1;
		int flag=0;
		while(i<=j) {
			
			if(s.charAt(i)!=s.charAt(j)) {
				flag++;
			}
			i++;
			j--;
			
		}
		if(flag==0) {
			System.out.println("It is a Palindrome");
		}
		else
			System.out.println("It is not a Palindrome");
		

	}

}
