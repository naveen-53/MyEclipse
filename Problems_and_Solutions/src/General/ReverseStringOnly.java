package General;

public class ReverseStringOnly {
	
	public static String reverse(String s) {
		char [] c = s.toCharArray();
		int left=0, right=c.length-1;
		while(left<right) {
			char temp = c[left];
			c[left]=c[right];
			c[right]=temp;
			left++;
			right--;
		}
		return new String(c);
	}

	public static void main(String[] args) {
		String str = "program02@hi02";
		//System.out.println(str.substring(0,7));
		int start=0;
		for(int i=0;i<str.length()-1;i++) {            //i=7  i=12
			if(!Character.isLetter(str.charAt(i)) && !Character.isLetter(str.charAt(i+1))) {
				System.out.print(reverse(str.substring(start,i)));
				start=i;
				System.out.println("----"+str.charAt(i));
			}
		
		
		/*
		 char[] a = str.toCharArray();
		int left=0;
		int right=a.length-1;
		
		while(left<right) {
			
			if(!Character.isLetter(a[left])) {
				left++;
			}
			else if(!Character.isLetter(a[right])) {
				right--;
			}
			
			else {
				char temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
		}
		String s = new String(a);
		System.out.print(s);
		*/
	
	}

	}
	}
