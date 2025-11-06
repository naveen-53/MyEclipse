package BackTracking.Maze;

import java.util.ArrayList;

/*
  						Question
  						
 Given an n x n binary matrix representing a maze, 
 where 1 means open and 0 means blocked,
 a rat starts at (0, 0) and needs to reach (n - 1, n - 1).

The rat can move up (U), down (D), left (L), and right (R), but:

It cannot visit the same cell more than once.
It can only move through cells with value 1.
Return all possible paths from the source to the destination as strings.
If no path exists, return -1.

*/


public class RatInMaze {
	
	
	static ArrayList<String> ratinMaze(int[][] maze,int r,int c,String p){
		if(r==maze.length-1 && c==maze[0].length-1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		ArrayList<String> list = new ArrayList<>();
		//Right
		maze[r][c]=0;
		if(c<maze.length-1 && maze[r][c+1]==1) {
			list.addAll(ratinMaze(maze,r,c+1,p+"R"));
		}
		//Up
		if(r>0 && maze[r-1][c]==1) {
			list.addAll(ratinMaze(maze,r-1,c,p+"U"));
		}
		//Left
		if(c>0 && maze[r][c-1]==1) {
			list.addAll(ratinMaze(maze,r,c-1,p+"L"));
		}
		//Down
		if(r<maze.length-1 && maze[r+1][c]==1) {
			list.addAll(ratinMaze(maze,r+1,c,p+"D"));
		}
		maze[r][c] = 1;
		
		return list;
		
		
	}

	public static void main(String[] args) {
		
		int[][] maze = {	{1, 0, 0, 0},
	            			{1, 1, 0, 1},
	            			{1, 1, 0, 0},
	            			{0, 1, 1, 1}	};
		
		ArrayList<String> al = ratinMaze(maze,0,0,"");
		System.out.println(al);

	}

}
