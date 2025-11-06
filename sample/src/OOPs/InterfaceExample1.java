package OOPs;

import java.util.Scanner;

interface Student{
	void display(String s ,int a);
}

public class InterfaceExample1 implements Student{
	public void display(String name,int reg) {
		System.out.println("Student Name: "+name);
		System.out.println("Student Reg.No: "+reg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name:");
		String a = sc.next();
		System.out.println("Enter Student Reg.No:");
		int r= sc.nextInt();
		InterfaceExample1 i = new InterfaceExample1();
		i.display(a, r);
		
		sc.close();
		
		
	}

}