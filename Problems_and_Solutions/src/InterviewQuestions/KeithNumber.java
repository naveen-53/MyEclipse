package InterviewQuestions;

/*										" Not Completed "
 *          
 */

import java.util.ArrayList;

public class KeithNumber {
	
	public boolean isKeithNum (int n) {
		int originalNum=n;
		ArrayList<Integer> al = new ArrayList<>();
		
		while(originalNum!=0) {
			al.add(0,originalNum%10);
			originalNum/=10;
		}
		int size = al.size();
		
		while(true) {  
			
			int nextNum=0;
			
			for(int i=al.size()-size;i<al.size();i++) {  nextNum+=al.get(i);	}
			
			if(nextNum==n) {	return true; }
			
			else if(nextNum>n) {	return false;	}
			
			al.add(nextNum);                      
		}
	}

	public static void main(String[] args) {
		int n=197;
		KeithNumber kn = new KeithNumber();
		
		if(kn.isKeithNum(n)) {	System.out.println(n+" is a Keith number");	}
		
		else	System.out.println(n+" is not a Keith number");
		
	}
}


