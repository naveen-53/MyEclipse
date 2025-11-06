package Patterns;

public class X_number {

	public static void main(String[] args) {
		int n=11;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j) {
					System.out.print(i);
				}
				else if(j==(n-i+1)) {
					System.out.print(j);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
