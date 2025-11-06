package Array;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] cube = new int[2][3][4];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<4;k++) {
					cube[i][j][k]=i+j+k;
				}
			}
		}
		
		//accessing & printing
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<4;k++) {
					System.out.print(cube[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
