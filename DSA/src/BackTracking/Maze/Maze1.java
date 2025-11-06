package BackTracking.Maze;

import java.util.ArrayList;

//this will be work on Travel only on right and down

public class Maze1 {
	
	//count no of paths
	static int mazePathCount(int r , int c) {
		if(r<=2 && c<=2) {
			if(r==2 && c==2) {	return 1;	}
			return mazePathCount(r,c+1)+ mazePathCount(r+1,c);
		}
		return 0;
		
	}
	
	//print no of paths
	static void mazePath(String p,int r, int c) {
		if(r==2 && c==2) {
			System.out.println(p);
			return;
		}
		if(c<2) {mazePath(p+'R',r,c+1);}
		if(r<2) {mazePath(p+'D',r+1,c);}
	}
	
	// return total paths in ArrayList
	static ArrayList<String> mazePathRet(String p,int r, int c) {
		if(r==2 && c==2) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> list = new ArrayList<>();
		
		if(c<2) {	list.addAll(mazePathRet(p+'R',r,c+1));	}
		if(r<2) {	list.addAll(mazePathRet(p+'D',r+1,c));	}
		
		return list;
	}
	
	
	public static void main(String[] args) {
		
		int path = mazePathCount(0,0);
		System.out.println(path);
		
		mazePath("",0,0);
		System.out.println("---------------------------------------");
		
		ArrayList<String> paths = mazePathRet("",0,0);
		System.out.println(paths);
	}

}
