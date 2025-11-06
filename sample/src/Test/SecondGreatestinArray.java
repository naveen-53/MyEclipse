package Test;

public class SecondGreatestinArray {

	public static void main(String[] args) {
		
		int []a = {1,3,4,2,5,9,8};
		int firstLarge=Integer.MIN_VALUE;
		int secondLarge=Integer.MIN_VALUE;
		
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>firstLarge) {
				secondLarge=firstLarge; // 1 3 4 5
				firstLarge=a[i];        // 3 4 5 9
			}
			else if(a[i]>secondLarge && a[i]<firstLarge) {
				secondLarge=a[i];
			}
		}
		System.out.println(secondLarge);

	}

}
