package testingJava;

public class VariableTypes {
	
	// Variable Types -	1. Global variable - variable defined under class level - outside any method - can be accessed in any method
					//	2. Local variable - variable defined under method level - inside a method - can only be used inside the method
					// Arguments/parameters inside the method
	
	static String a = "Hello"; // Global variable
	static int b; // undefined Global variable
	
	static void test1() {
		int b = 10; // local variable
		String a = "hi"; // not a duplicate variable, it's local variable
		System.out.println(a); // local variable will be preferred than global
		System.out.println(b);
		
		int c;
		c = 100;
		System.out.println(c);
		c = 1000;
		System.out.println(c);
	}
	
	static void test2() {
		b = 10+20;
		System.out.println(b);
	}
	
	static void test3(int a , int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		System.out.println(a);
		test1();
//		System.out.println(b); // as b is local variable - cannot be used in different other method
		b = 1000; // assigning value to global variable
		System.out.println(b);
		test2();
		test3(20,50);
	}

}
