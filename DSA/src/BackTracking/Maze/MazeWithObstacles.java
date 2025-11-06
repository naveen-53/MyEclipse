package BackTracking.Maze;

import java.util.ArrayList;

// this will be work on Travel only on right and down

public class MazeWithObstacles {
	
	static ArrayList<String> pathWithObstacle(boolean[][] route, String p, int r, int c){
		if(r==route.length-1 && c==route[0].length-1) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> list = new ArrayList<>();
		
		if(!route[r][c]) {
			return list;
		}
		if(r<route.length-1 && c<route[0].length-1) {
			list.addAll(pathWithObstacle(route,p+'D',r+1,c+1));
		}
		if(r<route.length-1) {
			list.addAll(pathWithObstacle(route,p+'V',r+1,c));
		}
		if(c<route[0].length-1) {
			list.addAll(pathWithObstacle(route,p+'H',r,c+1));
		}
		
		return list;
		
	}

	public static void main(String[] args) {
		
		// true -> path		false -> river
		
		boolean[][] route = {{true,true,false},
							{true,false,true},
							{true,true,true}};
		
		ArrayList<String> paths = pathWithObstacle(route,"",0,0);
		
		System.out.println(paths);
		
		

	}

}
