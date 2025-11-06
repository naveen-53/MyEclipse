package Easy;

/*
 *  Question link - https://leetcode.com/problems/missing-number/description/
 */
public class MissingNumber_268 {
	static int missingNum(int[] a) {
		sort(a);
		for(int i=0;i<a.length;i++) {
			if(a[i]!=i) {
				return i;
			}
		}
		return a.length;
	}
	
	static void sort(int[] a) {
		int i=0;
		while(i<a.length) {
			int correct = a[i];
			if(a[i]<a.length && a[i]!=a[correct]) {
				swap(a,i,correct);
			}
			else {
				i++;
			}
		}
			
	}
	static void swap(int[] a, int first, int second) {
		int temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}

	public static void main(String[] args) {
		int[] nums = {3,0,1};
		System.out.println(missingNum(nums));
		

	}

}
