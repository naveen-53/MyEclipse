package OOPs;

class Shape2{
	public void area() {
		System.out.println("Printing Area");
	}
	public void area(int length, int breath) {
		int area=length*breath;
		System.out.println("Area of Rectangle "+area);
	}
	public void area(double radius) {
		double area=3.14*radius*radius;
		System.out.println("Area of Circle "+area);	
	}
	public void area(int side) {
		int area=side*side;
		System.out.println("Area of Square "+area);
	}
}
public class MethodOverloadingExample {

	public static void main(String[] args) {
		Shape2 s1 = new Shape2();
		s1.area();
		s1.area(5);
		s1.area(7.0);
		s1.area(5, 6);
		
		

	}

}
