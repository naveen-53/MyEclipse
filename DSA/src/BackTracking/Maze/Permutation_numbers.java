package BackTracking.Maze;

import java.util.ArrayList;
import java.util.List;

public class Permutation_numbers {
	
	static List<List<Integer>> perm(int[] arr){
		List<List<Integer>> result = backTrack(arr, new ArrayList<>(), new boolean[arr.length]);
		//System.out.println(result.get(1));
		return result;
	}

	private static List<List<Integer>> backTrack(int[] arr, List<Integer> temp, boolean[] b) {
		List<List<Integer>> list = new ArrayList<>();
		if(temp.size()==arr.length) {
			list.add(new ArrayList<>(temp));
			return list;
		}
		for(int i=0;i<arr.length;i++) {
			if(b[i]) {	continue;	}
			temp.add(arr[i]);
			b[i]=true;
			
			list.addAll(backTrack(arr,temp,b));
			temp.remove(temp.size()-1);
			b[i]=false;
		}
		
		return list;

		
	}

	public static void main(String[] args) {
		
		int[] a = {1,2,3};
		
		System.out.println(perm(a));
		

	}

}
