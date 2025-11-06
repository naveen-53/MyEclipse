package BacktrackingProblems;

import java.util.ArrayList;

/*
 		Question -> https://www.geeksforgeeks.org/problems/combination-sum-1587115620/1
 
Given an array of distinct integers arr[] and an integer target,
the task is to find a list of all unique combinations of array 
where the sum of chosen element is equal to target.

Note: The same number may be chosen from array an unlimited number of times.
Two combinations are unique if the frequency of at least one of the chosen numbers is different.

Examples: 

Input: arr[] = [2, 4, 6, 8], target = 8
Output: [[2, 2, 2, 2], 
                [2, 2, 4],
                [2, 6],
                [4, 4],
                [8]]

Input: arr[] = [2, 7, 6, 5], target = 16
Output: [[2, 2, 2, 2, 2, 2, 2, 2],
                [2, 2, 2, 2, 2, 6],
                [2, 2, 2, 5, 5],
                [2, 2, 5, 7],
                [2, 2, 6, 6],
                [2, 7, 7],
                [5, 5, 6]]

*/
public class CombinationalSum {
	
	static void combinationSum(int[] a,int remSum,ArrayList<Integer> cur,ArrayList<ArrayList<Integer>> list,int index){
		if(remSum==0) {
			list.add(new ArrayList<>(cur));
			return;
		}
		if(remSum<0 || index>=a.length) {
			return;
		}
		cur.add(a[index]);
		combinationSum(a,remSum-a[index],cur,list,index);
		cur.remove(cur.size()-1);
		combinationSum(a,remSum,cur,list,index+1);
	}
	
	static ArrayList<ArrayList<Integer>> combination(int[] a,int k){
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> cur = new ArrayList<>();
		
		combinationSum(a,k,cur,list,0);
		return list;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int k =5;
		
		ArrayList<ArrayList<Integer>> list = combination(arr,k);
		
		for(ArrayList<Integer> a : list) {
			System.out.println(a);
		}

	}

}
