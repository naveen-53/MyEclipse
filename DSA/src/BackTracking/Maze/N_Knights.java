package BackTracking.Maze;

public class N_Knights {
	
	static int knights(boolean[][] board,int row, int col, int knight) {
		if(knight==0) {
			display(board);
			System.out.println();
			return 1;
		}
		int count=0;
		if(col==board.length) {
			count+=knights(board,row+1,0,knight);
			return count;
		}
		if(row==board.length-1 && col==board.length-1) {
			return count;
		}
		
		if(isSafe(board,row,col)) {
			board[row][col] = true;
			count+=knights(board,row,col+1,knight-1);
			board[row][col]=false;			
		}
		return count+=knights(board,row,col+1,knight);
		
	}

	private static boolean isSafe(boolean[][] board,int row,int col) {
		if(isValid(board,row-1,col-2)) {
			if(board[row-1][col-2]) {
				return false;
			}
		}
		if(isValid(board,row-2,col-1)) {
			if(board[row-2][col-1]) {
				return false;
			}
		}
		if(isValid(board,row-1,col+2)) {
			if(board[row-1][col+2]) {
				return false;
			}
		}
		if(isValid(board,row-2,col+1)) {
			if(board[row-2][col+1]) {
				return false;
			}
		}
		return true;
	}

	private static boolean isValid(boolean[][] board, int row, int col) {
		if(col>=0 && row>=0 && col<board.length && row<board.length) {
			return true;
		}
		return false;
	}

	private static void display(boolean[][] board) {
		for(boolean[] row: board) {
			for(boolean element: row) {
				if(element) {	System.out.print("K ");	}
				else {	System.out.print("- ");}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=3;
		System.out.println(knights(new boolean[n][n],0,0,4));

	}

}
