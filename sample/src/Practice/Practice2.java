package Practice;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] s = {"flowers","flow","fly"};
		int flag=0;
		
		StringBuilder sb = new StringBuilder("hi");
		
		for(int i=0;i<s.length;i++) {        //
			char ch =s[0].charAt(i);        // f
			
			for(int j=1;j<s.length;j++) {    //
				
				if(i==s[j].length() || s[j].charAt(i)!=ch) { // 0==
					System.out.println(s[0].substring(0, i));
					flag=0;
					 break;
				}
				else {
					
				}
			}
			if(flag!=0)
			sb.append(ch);
		}
		//System.out.println(s[0]);
		System.out.println();
		String n = sb.toString();
		
		

	}

}
