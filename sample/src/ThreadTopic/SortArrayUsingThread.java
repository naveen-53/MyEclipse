package ThreadTopic;

public class SortArrayUsingThread {

	public static void main(String[] args) {
		
		int a[]= {7,5,2,3,9,1};
		int temp;
		for(int i=0;i<a.length;i++) {        // i=0
			for(int j=i+1;j<a.length;j++) {  // j=1 j=2 j=3 j=4
				if(a[j]<a[i]) {              // 5>7 2>7 3>7 9>7
					temp = a[i];             //             t=7
					a[i]=a[j];               //            a[0]=9
					a[j]=temp;               //            a[4]=7
				}
			}
		}
		for(int k : a) {
			System.out.println(k);
		}

	}

}
