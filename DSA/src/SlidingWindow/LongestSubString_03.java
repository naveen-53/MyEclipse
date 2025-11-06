package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;

//  Question ->  https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LongestSubString_03 {
	
	static int lengthOfLongestSubstring(String s) {
        
        int l=0,maxLen=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            
            if(hm.containsKey(c) && hm.get(c)>=l){
                l=hm.get(c)+1;
            }
            hm.put(c,r);
            maxLen=Math.max(maxLen,r-l+1);
        }
        
        return maxLen;
    }
	// Solution -> 2
	static int lengthOfLongestSubstring_2(String s) {
		HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++) {

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, (right - left + 1));
        }

        return maxLen;
	}

	public static void main(String[] args) {
		
		String s = "abcdzabdcaefb";
		int n = lengthOfLongestSubstring(s);
		System.out.println(n);
		

	}

}
