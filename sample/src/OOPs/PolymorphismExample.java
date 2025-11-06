package OOPs;

class Shape1{
	public void print() {
		System.out.println("Common Types are Shapes");
	}
}

class Rectangle1 extends Shape1{
	public void print() {
		System.out.println("In Rcetangle diagonal sides are equal");
	}
}

class Square extends Shape1{
	public void print() {
		System.out.println("In Square all sides are equal");
	}
}
public class PolymorphismExample {

	public static void main(String[] args) {
		Shape1 s= new Shape1();
		Shape1 rec = new Rectangle1();
		Shape1 sq = new Square();
		
		s.print();
		rec.print();
		sq.print();

	}

}
