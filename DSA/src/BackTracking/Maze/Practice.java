package BackTracking.Maze;

import java.util.ArrayList;

import java.util.List;

public class Practice {
	
	static List<List<String>> nQueens(boolean[][] board,int row) {
		List<List<String>> list = new ArrayList<>();
		if(row==board.length) {
			list.add(addinList(board));					
		}
		
		for(int col=0;col<board.length;col++) {
			if(isSafe(board,row,col)) {
				board[row][col]=true;
				List<List<String>> ans =nQueens(board,row+1);
				board[row][col]=false;
				list.addAll(ans);
			}
		}
		
		return list;
		
	}

	private static boolean isSafe(boolean[][]board,int row, int col) {
		for(int i=0;i<board.length;i++) {
			if(board[i][col]) {	return false;}
		}
		
		int maxLeft =Math.min(row, col);
		for(int i=1;i<=maxLeft;i++) {
			if(board[row-i][col-i]) {	return false;}
		}
		
		int maxRight =Math.min(row, board.length-1-col);
		for(int i=1;i<=maxRight;i++) {
			if(board[row-i][col+i]) {	return false;}
		}
		
		return true;
				
	}

	private static List<String> addinList(boolean[][] board) {
		List<String> list =  new ArrayList<>();
		for(boolean[] arr : board) {
			StringBuilder sb = new StringBuilder();
			for(boolean  value : arr) {
				sb.append(value?"Q":".");
			}
			list.add(sb.toString());
		}
		return list;
	}

	public static void main(String[] args) {
		int n=4;
		boolean[][] board = new boolean[n][n];
		
		List<List<String>> list =nQueens(board,0);
		
		System.out.println(list);

	}

}
