package EmployeeManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeOperations {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<Employee> al = new ArrayList<>(
			Arrays.asList(
					new Employee(1,"Naveen","Java",100000),
					new Employee(2,"Nandhini","Python",90000),
					new Employee(3,"Rajavel","React",60000),
					new Employee(4,"Darmik","Java",50000),
					new Employee(5,"Dhanush","Java",20000),
					new Employee(6,"Bharathi","Python",80000)
					)
			);
	
	
	 public void addEmployee() {
		System.out.println("Enter id:");
		int id = sc.nextInt();
		System.out.println("Enter Name:");
		String name = sc.next();
		
		System.out.println("Enter Department:");
		String dept = sc.next();
		
		System.out.println("Enter salary:");
		double salary = sc.nextDouble();
		
		al.add(new Employee(id,name,dept,salary));
		
	}
	
	public void displayInfo() {
		al.stream().forEach(a -> System.out.println(
				a.getId()+"   "+
				a.getName()+"\t\t"+
				a.getDepartment()+"\t\t"+
				a.getSalary()));
	}
	
	//filter employees by department
	public void filterByDepartment() {
		System.out.println("Enter department:");
		String s = sc.next();
		al.stream().filter(n->n.getDepartment().equals(s)).forEach(a -> System.out.println(
				a.getId()+"\t"+
				a.getName()+"\t\t"+
				a.getDepartment()+"\t\t"+
				a.getSalary()));
	}
	
	//sort employees by salary(descending)
	public void sortbySalaryDesc() {
		al.stream()
		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		.forEach(a-> System.out.println(
				a.getId()+"   "+
				a.getName()+"\t\t"+
				a.getDepartment()+"\t\t"+
				a.getSalary()));
	}

	//find employee who get highest salary
	public void maxSalary() {
		Employee e = al.stream()
				.max(Comparator.comparingDouble(Employee::getSalary))
				.orElse(null);
		
		System.out.println(e);
		
	}
	
	// Display names only
	public void displayNames() {
		al.stream().map(Employee::getName).sorted().forEach(System.out::println);
		
	}

	//Group employees by department
	public void groupByDepartment() {
		Map<String,List<Employee>> groupByDept = al.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment));
		
		for(Map.Entry<String, List<Employee>> m : groupByDept.entrySet()) {
			m.getValue().stream()
			.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
			.forEach(System.out::println);
			System.out.println("------------------------\n");
		}	
	}
	
	//Calculate average salary by department
	public void avgSalaryByDept() {
		Map<String,Double> m = al.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.averagingDouble(Employee::getSalary)
				));
		
		m.forEach((dept,avg) -> System.out.println(dept+" : "+String.format("%.2f", avg)));;
		
	}
}
