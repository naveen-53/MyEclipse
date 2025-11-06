package BackTracking.Maze;

import java.util.Arrays;

public class PrintPathinVisual {
	
	static void printAllPathWays(boolean[][] way,String p,int r,int c,int[][] path,int step) {
	
		if(r==way.length-1 && c==way[0].length-1) {	
			path[r][c]=step;
			for(int[] arr : path) {
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
			return;
		}
		
		if(!way[r][c]) {	return;	}
		
		way[r][c]=false;
		path[r][c]=step;
		
		if(r<2) {
			printAllPathWays(way,p+'D',r+1,c,path,step+1);
		}
		if(c<2) {
			printAllPathWays(way,p+'R',r,c+1,path,step+1);
		}
		if(r>0) {
			printAllPathWays(way,p+'U',r-1,c,path,step+1);
		}
		if(c>0) {
			printAllPathWays(way,p+'L',r,c-1,path,step+1);
		}
		
		way[r][c]=true;
		path[r][c]=0;
	}

	public static void main(String[] args) {
	
		boolean[][] way = {	{true,true,true},
							{true,true,true},
							{true,true,true}	};
		
		int[][] path = new int[way.length][way[0].length];
		
		printAllPathWays(way,"",0,0,path,1);
	}

	}
