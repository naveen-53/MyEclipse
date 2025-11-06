package Test;

public class FindDuplicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {1,6,4,5,3,5,4,1};
		
		System.out.print("The Duplicates are ");
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
