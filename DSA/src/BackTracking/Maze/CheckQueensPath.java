package BackTracking.Maze;

public class CheckQueensPath {
	
	static boolean checkPath(boolean[][] path,int row){
		for(int i=0;i<path.length;i++) {
			if(path[row][i]) {
				for(int j=i+1;j<path.length;j++) {
					if(path[row][j]) {	return true;	}
				}
			}
		}
		
		return false;
	}
	
	private static boolean isSafe(boolean[][] board, int row, int col) {
		//vertical check
		for(int i=0;i<row;i++) {
			if(board[i][col]) {	return false;	}
		}
		
		//left diagonal check
		int maxLeft =Math.min(row, col);
		for(int i=1;i<=maxLeft;i++) {
			if(board[row-i][col-i]) {	return false;	}
		}
		
		// right diagonal check
		int maxRight =Math.min(row, board.length-col-1);
		for(int i=1;i<=maxRight;i++) {
			if(board[row-i][col+i]) {	return false;	}
		}
		return true;
	}
	static boolean checkothers() {
		
	}

	public static void main(String[] args) {
		boolean[][] path = {{false,true,false,false},
							{false,false,false,true},
							{true,false,false,false},
							{false,false,true,false}};

	}

}
