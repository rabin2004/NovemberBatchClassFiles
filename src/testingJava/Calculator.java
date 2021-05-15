package testingJava;

public class Calculator {
	// creating variables
	public static int a=10;
	public static int b=20;
	
	public static void addition() {
		int c = a+b;
		System.out.println("Addition: "+c);
	}
	
	public static void substraction() {
		int c = a-b;
		System.out.println("Substraction: "+c);
	}
	
	public static void multiplication() {
		int c = a*b;
		System.out.println("Multiplication: "+c);
	}
	
	public static void division() {
		int c = b/a;
		System.out.println("Division: "+c);
	}

	public static void main(String[] args) {
		
		//Object creation: Requirements for object creation
		//referring class  ||	object referenceName ||  object of Calculator class	
		Calculator 				cal = 					new Calculator();
		
		cal.addition();
//		cal.substraction();
//		cal.multiplication();
//		cal.division();
		
	}

}
