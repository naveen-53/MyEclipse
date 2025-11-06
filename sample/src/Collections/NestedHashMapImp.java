package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NestedHashMapImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentDetailSize1 = 0;
		int studentDetailSize2 = 0;
		
		HashMap<Object,String> stud1 = new HashMap<>();
		HashMap<Object,String> stud2 = new HashMap<>();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter total no.of size for Student 1 details: ");
		studentDetailSize1 = Integer.parseInt(in.nextLine());
		System.out.println("Enter total no.of size for Student 2 details: ");
		studentDetailSize1 = Integer.parseInt(in.nextLine());
		
		for(int k=1;k<=studentDetailSize1;k++) {
			int id=100;
			String stdName="";
			System.out.println("Enter the Name "+k+" of "+studentDetailSize1);	
			stdName=in.nextLine();
			System.out.println("Student id: "+(id+k)+" Student Name: "+stdName);	
			id=id+k;
			stud2.put(id, stdName);
			
		}
		for(int k=1;k<=studentDetailSize2;k++) {
			int id=200;
			String stdName="";
			System.out.println("Enter the Name "+k+" of "+studentDetailSize2);	
			stdName=in.nextLine();
			System.out.println("Student id: "+(id+k)+" Student Name: "+stdName);	
			id=id+k;
			stud2.put(id, stdName);
			
		}
		System.out.println(stud1);
		System.out.println(stud2);
		Map<String,Object> allDetails = new HashMap<>();
		allDetails.put("BSC", stud1);
		allDetails.put("MSC", stud2);
		System.out.println(allDetails);
		System.out.println("-----------All Details of the student---------------");
		
		for(String course : allDetails.keySet()) {
			
			ArrayList<Object> data = new ArrayList<Object>
			(((Map<Object,String>)allDetails.get(course)).keySet());
			
			for(Object obj : data) {
				
				System.out.print("Course: "+course+" Student ID: "+obj+"Student Name: "+
								((Map<Object,String>)allDetails.get(course)).get(obj));
			}
		}
		
		

	}

}
