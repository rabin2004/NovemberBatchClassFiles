package testingJava;

public class StaticVsNonStaticConcept {
	
	// Static Vs Non-Static -> when methods or variables are being called
	
	static String a = "Hello"; // static variable
	String b = "Java"; // non-static variable
	
	static void test1() { // static method
		System.out.println("Static method");
	}
	
	void test2() { // non-static method
		System.out.println("Non-static method");
	}

	public static void main(String[] args) { // main method is default defined as static but can be changed into non-static
		// static & non-static mismatch => can throw error/warning

		// static : 1. can be called directly
		System.out.println(a);
		test1();
		
		// static: 2. can be called with class reference
		System.out.println(StaticVsNonStaticConcept.a);
		StaticVsNonStaticConcept.test1();
		
		// static: 3. can be called with object reference but is a method for non-static approach
		StaticVsNonStaticConcept snc = new StaticVsNonStaticConcept(); // object of the class
		System.out.println(snc.a);
		snc.test1();
		
		// non-static : 1. static method/variable can't be called directly
//		System.out.println(b);
//		test2();
		
		// non-static : 2. static method/variable can't be called with class reference
//		System.out.println(StaticVsNonStaticConcept.b);
//		StaticVsNonStaticConcept.test2();
		
		// non-static: 3. can only be called with object reference
		StaticVsNonStaticConcept snc1 = new StaticVsNonStaticConcept();
		System.out.println(snc.b);
		snc.test2();
	}

}
