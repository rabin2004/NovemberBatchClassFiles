package testingJava;

public class DataMathematicalOperationConcept {

	// Arithmetic/mathematical Operation -> +, -, *, /
	
	public static void main(String[] args) {
		//create variable
		int a = 100; // assigning integer value to reference name 'a'
		int b = 200;
		
		// addition
//		int c = a+b; // "+" addition
//		System.out.println(c);
//		System.out.println(a+b);
//		System.out.println("Addition of a & b: "+c); // "+" as place/concatenate operator 
//		System.out.println("Addition of a & b: "+(a+b));
		
		// shortcut for System.out.println() => Type sysout then ctrl+space
//		System.out.println();
		
		// Substraction
//		System.out.println(a-b);
//		System.out.println("Substraction of a & b: "+(a-b));
		// multiplication
//		System.out.println(a*b);
//		System.out.println("Multiplication of a & b: "+(a*b));
		// Division
//		System.out.println(b/a);
//		System.out.println("Division of b & a: "+(b/a));
		
//		System.out.println(a/b);
//		int c = a/b;
//		System.out.println(c);
		
		// a as a reference name can't used = duplicate variable name is not allowed
//		float a = 100;
		float a1 = 100;
		float b1 = 200;
		
		float c1 = a1/b1;
		
//		System.out.println(c1);
//		System.out.println(a1/b1);
		
		double a2 = 1.56;
		double b2 = 1.44;
		
		System.out.println(a2+b2);
//		int c3 = a2*b2; // not allowed - dataType mismatch
		double c2 = a2*b2;
		System.out.println(c2);
		
		double height = 1.5;
		double weight = 80;
		
		double bmi = weight/(height*height);
		
		System.out.println("BMI: "+bmi);
		
		// Assignment:
//			1. conversion of celsius into farenhiet & vice versa.
//			2. area of a triangle
//			3. area of circle
	}

}
