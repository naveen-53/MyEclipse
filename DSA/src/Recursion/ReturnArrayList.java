package Recursion;

import java.util.ArrayList;

public class ReturnArrayList {
	
	// return ArrayList with passing argument as ArrayList
	static ArrayList<Integer> returnArrayList(int[] arr,int target,int index,ArrayList<Integer> al){
		if(index==arr.length) {	return al;	}
		
		if(arr[index]==target) {al.add(index);	}
		
		return returnArrayList(arr,target,index+1,al);
	}

	// return ArrayList without passing argument as ArrayList
	static ArrayList<Integer> returnArrayList(int[] arr,int target,int index){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(index==arr.length) {	return list;	}
		if(arr[index]==target) {list.add(index);}
		
		ArrayList<Integer> al = returnArrayList(arr,target,index+1);
		list.addAll(al);
		return list;
	}
	
	public static void main(String[] args) {
		int [] a = {1,2,3,4,4,5,6,4,4};
		int target = 4;
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.println(returnArrayList(a,target,0));
		

	}

}
