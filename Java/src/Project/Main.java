package Project;

import java.util.ArrayList;

public class Main{
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person(101,"Naveen",23,new Course(201,"Java",8)));
		list.add(new Person(102,"Pavith",24,new Course(202,"Angular",6)));
		list.add(new Person(103,"Jana",24,new Course(203,"React",5)));
		list.add(new Person(104,"Naveen",23,new Course(204,"Python",3)));
		
		for(Person p : list) {
			int pid= p.p_id;
			String pn = p.p_name;
			int pa = p.age;
			int cid= p.course.id;
			String cn = p.course.c_name;
			int cd = p.course.duration;
			
			System.out.println(pid+"\t"+pn+"\t"+pa+"\t"+cid+"\t"+cn+"\t"+cd);
			 
			
			
			
			
		}
		System.out.println(list.get(0).course.duration);
	}

	
}
