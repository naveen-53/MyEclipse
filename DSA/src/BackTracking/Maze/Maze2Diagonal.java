package BackTracking.Maze;

import java.util.ArrayList;

//this will be work on Travel only on right and down

public class Maze2Diagonal {
	
	static int countPath(int r, int c) {
		
		if(r==2 || c==2) {return 1;	}
		
		int dig=0,left=0,right=0;
		
		if(r<2 && c<2) {	dig =countPath(r+1,c+1);}
		
		if(r<2) {	left = countPath(r+1,c);	}
		
		if(c<2) {	right = countPath(r,c+1);	}
		
		return dig+left+right;
		
	}
	static void diplayPaths(String p, int r, int c) {
		if(r==2 && c==2) {
			System.out.println(p);
			return;
		}
		
		if(r<2 && c<2) {
			diplayPaths(p+'D',r+1,c+1);
		}
		
		if(r<2) { 
			diplayPaths(p+'H',r+1,c);
		}
		
		if(c<2) {
			diplayPaths(p+'V',r,c+1);
		}	
	}
	
	static ArrayList<String> diplayPathsRet(String p, int r, int c) {
		if(r==2 && c==2) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		
		
		if(r<2 && c<2) {
			list.addAll(diplayPathsRet(p+'D',r+1,c+1));
		}
		
		if(r<2) { 
			list.addAll(diplayPathsRet(p+'H',r+1,c));
		}
		
		if(c<2) {
			list.addAll(diplayPathsRet(p+'V',r,c+1));
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		 
		int ans= countPath(0,0);
		System.out.println(ans);
		
		//diplayPaths("",0,0);
		
		ArrayList<String> list = diplayPathsRet("",0,0);
		System.out.println(list);

	}

}
