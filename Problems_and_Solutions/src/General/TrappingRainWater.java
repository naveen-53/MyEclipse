package General;

public class TrappingRainWater {
	
	

	public static void main(String[] args) {
		
		int[] a= {2,0,1,3,0,2};
		int max=-1;
		int[] left=new int[a.length];
		int[] right=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			if(max<=a[i]) {
				max=a[i];   
			}
			left[i]=max;     //  2 2 2 3 3 3
		}
		max=-1;
		for(int i=a.length-1;i>=0;i--) {
			if(max<=a[i]) {
				max=a[i];
			}
			right[i]=max;      //   2 2 3 3 3 3
		}
		int target=0;
		for(int i=0;i<a.length;i++) {
			target+= Math.min(left[i], right[i])-a[i];
		}
		System.out.println(target);
		

	}

}
