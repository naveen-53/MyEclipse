package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

	public static void main(String[] args) {
		int rows = 4;
		
		List<Integer> list = new ArrayList<>();
		long ans =1;
		list.add((int) ans);
		
		for(int i=1;i<=rows;i++) {
			ans = ans*(rows-i+1);
			ans=ans/i;
			list.add((int) ans);
		}
		System.out.println(list);

	}

}
