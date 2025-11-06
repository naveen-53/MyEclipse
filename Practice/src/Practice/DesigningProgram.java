package Practice;

import java.util.ArrayList;

class Student{
	private int id;
	private String name;
	private double percen;
	
	public Student(int id, String name, double percen) {
		super();
		this.id = id;
		this.name = name;
		this.percen = percen;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercen() {
		return percen;
	}
	public void setPercen(double percen) {
		this.percen = percen;
	}
	
	void display() {
		System.out.println("ID: "+id+"\tName: "+name+"\tPercentage : "+percen);
	}
	
	
	
}

public class DesigningProgram {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(1,"Naveen",92.6));
		al.add(new Student(1,"Naveen",92.6));
		
		//Student s = new Student();
		
		for(Student a : al) {
			a.display();
		}

	}

}
