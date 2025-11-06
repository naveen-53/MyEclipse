package LeetCode;

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		PascalTriangle p = new PascalTriangle();
		
		int rows = 5;
		
		for(int i=0;i<rows;i++) {                 
			list.add(new ArrayList<Integer>());
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i) {
					list.get(i).add(1);
				}
				else {
					int val = list.get(i-1).get(j-1) + list.get(i-1).get(j);
					list.get(i).add(val);
				}
			}
		}
		
		p.printValues(list);
	}
	
	public void printValues(ArrayList<ArrayList<Integer>> al) {
		//for(int i=0;i<al.size();i++) {
			for(int j=0;j<al.get(4).size();j++) {
				System.out.print(al.get(4).get(j)+" ");
			}
			System.out.println();
		//}
	}

}
