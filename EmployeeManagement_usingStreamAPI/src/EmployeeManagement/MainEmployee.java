package EmployeeManagement;

import java.util.Scanner;

public class MainEmployee {
	static void show() {
		System.out.println("1.Add new Employee"+"\t\t"+"2.Sort by Salary");
		System.out.println("3.Filter by Department" +"\t\t"+ "4.Maximum Salary");
		System.out.println("5.Group by department" +"\t\t"+ "6.Total salary in each department");
		System.out.println("-----------------------------------------------------------------------\n");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmployeeOperations emp = new EmployeeOperations();
		emp.displayInfo();
		System.out.println();
		System.out.println("----------------------------------------");
		String s = "Yes";
		while(s.equals("Yes")) {
			show();
			System.out.println("enter the number:");
			int a =sc.nextInt();
			switch(a) {
			case 1:
				emp.addEmployee();
				System.out.println("added Sucessfully");
				break;
				
			case 2:
				emp.sortbySalaryDesc();
				break;
				
			case 3:
				emp.filterByDepartment();
				break;
				
			case 4:
				emp.maxSalary();
				break;
				
			case 5:
				emp.groupByDepartment();
				break;
				
			case 6:
				emp.avgSalaryByDept();
				break;
				
			default:
				System.out.println("you entered wrong input.Please select the correct Option");
				break;
				
			}
			System.out.println("----------------------------------------\n");
			System.out.println("Do you want to continue Yes/No");
			s = sc.next();
			
		}
		System.out.println("Thank You!");
		
		
		
		
		
		
		
		//List of employee names only
		//emp.displayNames();

	}

}
