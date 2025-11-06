package ArraysProblem;

public class MinAndMax {

	public static void main(String[] args) {
		int[] arr = {};
		int max =arr[0], min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("Max : "+max +"\tMin : "+min);

	}

}
