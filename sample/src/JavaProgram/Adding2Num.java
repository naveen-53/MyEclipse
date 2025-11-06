package JavaProgram;

import java.util.Scanner;

public class Adding2Num {
	void Add(int a,int b) {
		int num=a+b;
		System.out.println("Total: "+num);
	}

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1   : ");
		a=sc.nextInt();
		System.out.println("Enter num2   : ");
		b=sc.nextInt();
		Adding2Num ad= new Adding2Num();
		ad.Add(a, b);
		
		sc.close();
	}

}
