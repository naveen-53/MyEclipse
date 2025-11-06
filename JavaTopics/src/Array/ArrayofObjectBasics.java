package Array;

class Student{
	public int id;
	public String name;
	
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public void display() {
		System.out.println("Student id is "+id+" name is "+name);
	}
}

public class ArrayofObjectBasics { 

	public static void main(String[] args) {
		
		Student arr[];   // array of objects
		arr= new Student[3];
		
		arr[0]= new Student(100,"Naveen");
		arr[1]= new Student(101,"Kumar");
		arr[2]= new Student(102,"Priya");
		
		System.out.println("Student data arr0");
		arr[0].display();
		System.out.println("Student data arr1");
		arr[1].display();
		System.out.println("Student data arr2");
		arr[2].display();

	}

}
