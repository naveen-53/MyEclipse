package SlidingWindow;

import java.util.HashMap;

// Question -> https://leetcode.com/problems/fruit-into-baskets/description/

public class FruitsIntoBasket_904 {
	
	public static void main(String[] args) {
		
		 int[] fruits = {3,3,3,1,2,1,1,2,3,4,4};
		 FruitsIntoBasket_904 obj = new FruitsIntoBasket_904();
		 int ans = obj.totalFruit(fruits);
		 System.out.println(ans); 
	}
	
	public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int l=0,r=0;
        int maxLen = 0;
        while(r<fruits.length){
            if(hm.containsKey(fruits[r])){	hm.put(fruits[r],hm.get(fruits[r])+1);}
            else{   hm.put(fruits[r],1);}

            while(hm.size()>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l]) <= 0){
                    hm.remove(fruits[l]);
                }
                l++;
            }
            if(hm.size()<=2){
                maxLen=Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
        
    }


}
