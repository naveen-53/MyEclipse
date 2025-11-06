package Graph;

import java.util.ArrayList;

public class AdjList_to_AdjMatrix {
	
	ArrayList<ArrayList<Integer>> graphList = new ArrayList<>();
	
	AdjList_to_AdjMatrix(int v){
		for(int i=0;i<v;i++) {
			graphList.add(new ArrayList<Integer>());
		}
	}

	public void addEdge(int u, int v) {
		graphList.get(u).add(v);
		graphList.get(v).add(u);
	}
	
	public void printGraphList() {
		for(int i=0;i<graphList.size();i++) {
			for(int j=0;j<graphList.get(i).size();j++) {
				System.out.print(graphList.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	
	//convert list to matrix
	
	public int[][] listtoMatrix(int vertices, ArrayList<ArrayList<Integer>> al){
		int adjMatrix[][] = new int[vertices][vertices];
		
		for(int i=0;i<vertices;i++) {
			for(int j: al.get(i)) {
				adjMatrix[i][j]=1;
			}
		}
		
		return adjMatrix;
	}
	
	public static void main(String[] args) {
		int vertices = 4;

		AdjList_to_AdjMatrix lm = new AdjList_to_AdjMatrix(vertices);
		
		lm.addEdge(0, 1);
		lm.addEdge(0, 2);
		lm.addEdge(0, 3);
		lm.addEdge(2, 3);
		
		lm.printGraphList();
		System.out.println("-----------------------------------------------------------------");
		
		int[][] convertedMatrix = lm.listtoMatrix(vertices, lm.graphList);
		
		for(int i=0;i<convertedMatrix.length;i++) {
			for(int j=0;j<convertedMatrix[i].length;j++) {
				System.out.print(convertedMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
