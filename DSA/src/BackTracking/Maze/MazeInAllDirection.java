package BackTracking.Maze;

import java.util.ArrayList;

public class MazeInAllDirection {
	
	static ArrayList<String> allPaths(boolean[][] route, String p,int r, int c){
		if(r==route.length-1 && c==route[0].length-1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		if(!route[r][c]) {
			return list;
		}
		route[r][c]=false;	// assign false once when you visited
		if(r<route.length-1) {		//move down
			list.addAll(allPaths(route,p+'D',r+1,c));
		}
		if(c<route[0].length-1) {		//move Right
			list.addAll(allPaths(route,p+'R',r,c+1));
		}
		if(r>0) {		//move Up
			list.addAll(allPaths(route,p+'U',r-1,c));
		}
		if(c>0) {		//move Left
			list.addAll(allPaths(route,p+'L',r,c-1));
		}
		
		route[r][c]=true;	// Assign true when work is completed(revert it to original value)
		
		return list;
		
	}

	public static void main(String[] args) {
		boolean[][] route = {{true,true,true},
							{true,true,true},
							{true,true,true}};

		ArrayList<String> paths = allPaths(route,"",0,0);

		System.out.println(paths);	

	}

}
