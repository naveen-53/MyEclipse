package Recursion.SubsetSubseq;

import java.util.ArrayList;

import java.util.ArrayList;

public class SubSequence {
	
	static void subSeq(String p,String up) {
		if(up.isEmpty()) {
			 System.out.println(p);
			 return;
		}
		char c = up.charAt(0);
		
		subSeq(p+c,up.substring(1));
		subSeq(p,up.substring(1));
		
	}
	
	static ArrayList<String> subSeq1(String p,String up) {
		if(up.isEmpty()) {
			ArrayList<String> ans = new ArrayList<>();
			if(!p.equals("")) {
				ans.add(p);
			}
			
			return ans;
		}
		char c = up.charAt(0);
		
		ArrayList<String> left = subSeq1(p+c,up.substring(1));
		ArrayList<String> right = subSeq1(p,up.substring(1));
		
		left.addAll(right);
		return left;
	}

	public static void main(String[] args) {
		String s = "abc";
		//subSeq("",s);
		System.out.println(subSeq1("",s));

	}

}
