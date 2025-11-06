package JavaProgram;

public class CallByValue {
		int data=50; // local variable
		// call by method
		void print(int data) {
			data=data+100; // changes in the local variable only
		}
		public static void main(String[] args) {
			CallByValue cbv= new CallByValue();
			System.out.println("before change: "+cbv.data);
			cbv.print(500); // calling the method "print"
			System.out.println("After change: "+cbv.data);

	}

}
