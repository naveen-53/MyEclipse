package JavaProgram;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=13,b=4;
		
		//unary operators
		//post Increment
		System.out.println("% values is "+(a++));
		
		//pre Increment
		System.out.println("% values is "+(++a));
		
		//post Decrement
		System.out.println("% values is "+(a--));
		
		//pre Decrement
		System.out.println("% values is "+(--a));
		
		//Assignment Operator with Arithmetic Operator
		System.out.println(b+=3);  //a=a+3
		
		//Comparison Operators
		
		int e=20,f=30,g=40;
		System.out.println("f>e : "+(f>e));     //> - greater than
		
		System.out.println("f<e : "+(f<e));      // < - lesser than
		
		System.out.println("f==e : "+(f==g));
		
		// Ternary Operators
		// condition ? if true : if false
		//max of three numbers
		
		int a1=20, b1=10, c1=30, result1;
		result1= ((a1>b1)?(a1>c1)?a1:c1:(b1>c1)?b1:c1);
		
		System.out.println("max of three nos "+ result1);
		
		//bitwise operators  (&, |, ^, )
		int a2= 0b1010;
		int b2= 0b1100;
		System.out.println("a2 & b2: "+(a2&b2));
		System.out.println("a2 | b2: "+(a2|b2));
		System.out.println("a2 ^ b2: "+(a2^b2));
		//System.out.println("a2  b2: "+(a2 b2));
		
		
		//instanceof() operator
		
		Operators o1=new Operators();
		Operators o2=new Operators();
		System.out.println(o1 instanceof Operators);
		System.out.println(o2 instanceof Operators);
		
				

	}

}
