package OOPs;

class GrandFather{
	public void showG() {
		System.out.println("He is a Grand Father");
	}
}
class Father extends GrandFather{
	public void showF() {
		System.out.println("He is a Father");
	}
}
class Son extends Father{
	public void showS() {
		System.out.println("He is a Son");
	}
}

public class Daughter extends Father {
	public void showD() {
		System.out.println("She is a Daughter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son obj1 = new Son();
		obj1.showG();
		obj1.showF();
		obj1.showS();
		
		Daughter obj2 = new Daughter();
		obj2.showG();
		obj2.showF();
		obj2.showD();

	}

}
