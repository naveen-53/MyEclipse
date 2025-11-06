package OOPs;

//Hierarchical and single Inheritance
class C{
	public void disp() {
		System.out.println("C");
	}
	
}
class A extends C{
	public void disp() {
		System.out.println("A");
	}
}
class B extends C{
	public void disp() {
		System.out.println("B");
	}
}
public class HybridInheritanceExample2 extends C {
	public void disp() {
		System.out.println("D");
	}

	public static void main(String[] args) {
		HybridInheritanceExample2 h = new HybridInheritanceExample2();
		h.disp();

	}

}
