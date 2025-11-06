package Practice;

public class MatrixMultiplication {

	public static void main(String[] args) {
		int a1[][]= { {1,2,3}, {4,5,6}, {7,8,9} };
		int a2[][]= { {1,2,3}, {4,5,6}, {7,8,9} };
		
		int m=a1.length;
		int n=a1[0].length;
		int p=a2.length;
		int q=a2[0].length;
		
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(p);
		System.out.println(q);
		
		int ans[][]= new int[m][q];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<q;j++) {
				for(int k=0;j<q;j++) {
					//ans[i][j]+=a1[i][k]*a2[j][k];
				}
			}
		}

	}

}
