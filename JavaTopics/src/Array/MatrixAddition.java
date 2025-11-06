package Array;



public class MatrixAddition {

	public static void main(String[] args) {
		// creating two matrices
		int a[][]= {{1,3,4},{2,4,3},{3,4,5}};
		int b[][]= {{4,5,7},{8,9,10},{5,3,4}};
		
		//creating matrix to store sum of matrices
		int c[][]= new int [3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
