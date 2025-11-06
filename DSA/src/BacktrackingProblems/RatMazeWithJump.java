package BacktrackingProblems;

import java.util.Arrays;

/*
 
 			Rat in a Maze with multiple steps or jump allowed   
 			
You are given an n × n maze represented as a matrix. The rat starts from the top-left corner (mat[0][0]) and must reach the bottom-right corner (mat[n-1][n-1]).

The rat can move forward (right) or downward.
A 0 in the matrix represents a dead end, meaning the rat cannot step on that cell.
A non-zero value at mat[i][j] indicates the maximum number of jumps the rat can make from that cell.

Your task is to return an n × n solution matrix where:
1 at (i, j) indicates the cell is part of the path.
0 at (i, j) indicates the cell is not included in the path.
If multiple solutions exist, choose the shortest path with the fewest hops. If hops are the same, prioritize moving right over moving down.

Examples:  

Input: mat = [[2,1,0,0], [3,0,0,1], [0,1,0,1], [0,0,0,1]]
Output: [[1,0,0,0], [1,0,0,1], [0,0,0,1], [0,0,0,1]]
Explanation: The rat starts at mat[0][0] and can jump up to 2 steps right or down.

First, it checks mat[0][1] (value 1), then mat[0][2] (value 0, so backtrack).
Next, it tries mat[1][0] (value 3), allowing a jump to mat[1][3].
From mat[1][3], the rat moves downward step by step to reach the destination at mat[3][3].
Input: mat = [[2,1,0,0], [2,0,0,1], [0,1,0,1], [0,0,0,1]]
Output: [[-1]]
Explanation: No valid path exists to reach mat[3][3], so the output is [-1].

*/

public class RatMazeWithJump {
	
	static int[][] ratInMazeWithJump(int[][] matrix){
		int[][] path = new int[matrix.length][matrix.length];
		if(!ratinMaze(matrix,0,0,path)) {
			return new int[][] {{-1}};
		}
		return path;
	}
		
	
	static  boolean ratinMaze(int[][] mat,int r, int c, int[][] ans){
		
		if(r==mat.length-1 && c==mat.length-1) {
			ans[r][c]=1;
			return true;
		}
		if(isSafe(mat,r,c) && ans[r][c]==0) {
			ans[r][c]=1;
			for(int i=1;i<=mat[r][c] && i<mat.length;i++) {
				
				if(ratinMaze(mat,r,c+i,ans)) {
					return true;
				}
				if(ratinMaze(mat,r+i,c,ans)) {
					return true;
				}
				
			}
			ans[r][c]=0;
			return false;
			
		}
		return false;
		
	}
	
	static boolean isSafe(int[][] path,int r,int c) {
		return (r>=0 && r<path.length && c>=0 && c<path.length && path[r][c]!=0);
	}

	public static void main(String[] args) {
		int[][] mat = {{2,1,0,0},{3,0,0,1},{0,1,0,1},{0,0,0,1}};
		
		int[][] ans = ratInMazeWithJump(mat);
		
		for(int i=0;i<ans.length;i++) {
			System.out.println(Arrays.toString(ans[i]));

		}
		
		
	}

}
