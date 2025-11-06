package JavaProgram;

class TestDetails{
	int sub1=96,sub2=89,sub3=93,sub4=87,sub5=98;
	void average() {
		int avg=(sub1+sub2+sub3+sub4+sub5)/5;
		System.out.println("Average: "+avg);
		
	}
}

public class Admission extends TestDetails {
	int admissionNo=123;
	String name="Naveen";

	public static void main(String[] args) {
		
		Admission a=new Admission();
		
		
		System.out.println("Name: "+a.name);
		System.out.println("Admission NO: "+a.admissionNo);
		
		a.average();
		
	}

}
