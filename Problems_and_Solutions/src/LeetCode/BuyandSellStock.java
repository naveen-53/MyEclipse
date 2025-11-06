package LeetCode;

public class BuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {7,1,5,3,6,4};
		/*
		int ans = 0;
		for(int i=0;i<a.length;i++) {
			int max=0;
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[j]>=max) {
					max=a[j];
					
				}
			}
			//System.out.println(i+" - "+max);
			if(ans<max-a[i] && a[i]<max) {
				ans=max-a[i];
			}
		}
		*/
		
		BuyandSellStock b = new BuyandSellStock();
		int answer = b.maxProfit(a);
		System.out.println(answer);

	}
	
	public int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for (int price : prices) {		// 0	1	2	3	4	5
            if (price < minPrice) {     //
                minPrice = price;  		// 7	1	1	1	1	1
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // - 	-	(0,
            }
        }
		return maxProfit;
		
	}

}
