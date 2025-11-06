package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		
		int nums[]= {0,1,2,4,5,7};
		List<String> list = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			int start=nums[i];
			
			while(i+1<nums.length && nums[i+1]== nums[i]+1) {
				i++;
			}
			if(start!=nums[i]) {
				list.add(start+"->"+nums[i]);
			}
			else {
				list.add(""+start);
			}
				
		}
		System.out.println(list);

	}

}
