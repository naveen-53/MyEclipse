package BacktrackingProblems;

import java.util.ArrayList;

public class SubSets_Numbers {
	
	static void subSets(int index,int[] a,ArrayList<Integer> cur,ArrayList<ArrayList<Integer>> list){
		if(index==a.length) {
			if(cur.isEmpty()) {
				return;
			}
			list.add(new ArrayList<>(cur));
			return;
		}
		cur.add(a[index]);
		subSets(index+1,a,cur,list);
		cur.remove(cur.size()-1);
		subSets(index+1,a,cur,list);
	}
	
	static ArrayList<ArrayList<Integer>> subsets(int arr[]) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> cur = new ArrayList<>();
		
		subSets(0,arr,cur,list);
		return list;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		ArrayList<ArrayList<Integer>> list = subsets(arr);
		Collections.so
		for(ArrayList<Integer> al : list) {
			System.out.println(al);
		}

	}

}
