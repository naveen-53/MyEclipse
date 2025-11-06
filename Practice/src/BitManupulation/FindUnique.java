package BitManupulation;

public class FindUnique {

	public static void main(String[] args) {
		int unique =0;
		
		int[] a = {2,3,2,4,3,6,4};
		
		for(int n : a) {
			unique^=n;
		}
		System.out.println(unique);
		
	}

}
