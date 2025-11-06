package JavaProgram;

import java.util.Scanner;

public class CarName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str[]=new String[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter the car name: ");
			str[i]=sc.next();
			
		}
		for(String s:str) {
			System.out.println(s);
		}
		
		sc.close();

	}

}
