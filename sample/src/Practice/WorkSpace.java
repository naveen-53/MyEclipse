package Practice;

/*
 * 		A                          00   
 *		b  F                       10  11
 * 		C  g  J                    20  21  22
 * 		d  H  k  M                 30  31  32  33
 * 		E  i  L  n  O              40  41  42  43  44
 * 
 * 
 */

public class WorkSpace {

	public static void main(String[] args) {
		
		char upper ='A';
		char lower ='a';
		/*
		  index=0;
		 for(int rows=1;row<=5;roes++)
		 	for(int col=1; col<=row; col++){
		 		System.out.print(letter[index]+"\t");
		 		index++;
		 	}
		 	
		 */
		
		
		
		for(int i=0;i<5;i++) {
			int value=4;
			for(int j=0;j<=i;j++) {
				if((i+j)%2==0) {
					//if(j=)
					System.out.print(upper+" ");
				}
				else
					System.out.print(lower+" ");
				
				upper++;
				lower++;
			}
			System.out.println();
		}
		

	}

}
