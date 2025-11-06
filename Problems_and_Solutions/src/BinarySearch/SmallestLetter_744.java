package BinarySearch;


/*
 * link - https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
 */

public class SmallestLetter_744 {
	
	static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end = letters.length-1;
        if(target>=letters[letters.length-1]){
            return letters[start];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(letters[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letters[start];
    }

	public static void main(String[] args) {
		char[] letters = {'c','f','j'};
		char target = 'f';
		System.out.println(nextGreatestLetter(letters,target));

	}

}
