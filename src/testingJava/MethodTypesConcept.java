package testingJava;

public class MethodTypesConcept {
	
	// Methods/functions types -> based on parameter
		// 1. Method with no parameter => method()
		// 2. Method with one parameter => method(DataType parameterReferenceName)
		// 3. Method with multiple parameter => method(parameter1, parameter2, parameter3)
	
	// method1() = name of the method
	// method(parameter/s) => DataType to be used in the method
	// basic requirement to create a method => return type, method name & method body
	
	public static void method1() {
		// body of method
		System.out.println("I am method 1");
	}
	
//	public static void method1() { // duplicate method -> not allowed (method with same name and same parameter)
//		
//	}
	
	public static void method1(int a) { // Method overloading -> method with same name but with different types or number of parameter
		System.out.println("Method overloading "+a);
	}
	
	public static void method1(String b) {
		System.out.println("Method overloading "+b);
	}
	
	public static void method2() {
		System.out.println("I am method 2");
	}
	
	public static void method3(String name) { // String name => parameter
		System.out.println("My name is "+name);
	}
	
//	public static void method3(String schoolName) { // duplicate method
//		
//	}
	
	public static void method4(String name, String id, int salary) {
		System.out.println("Employee "+name+" with "+id+ " has $"+salary+" per week.");
	}

	public static void main(String[] args) {
		method1(); // method calling
		method1(10);
		method1("Apple");
//		method2();
//		method3("John");
//		method4("John", "J12345", 700);

	}

}
