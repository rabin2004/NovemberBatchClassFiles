package oOPSconcept;

public abstract class AbstractClassConcept {
	
	// Class VS AbstractClass:
		// 1. Abstract class has abstract as a keyword where as class doesn't
		// 2. Abstract class can have abstract and non-abstract method but class can only have non-abstract method
		// 3. Abstract method can be implemented in sub-class (inheritance), until sub-class implements abstract method it will display error
	
	// Abstract method VS ( Regular/Non-abstract method -> return type, method name & method body)
		// -> Abstract method - return type, method name but "No method body", in addition need to have abstract keyword in front of the method
	
	
	static void test1() { // non-abstract method      - QA (US)
		System.out.println("Non-abstract method 1");
	}
	
	static void test4() {
		System.out.println("Non-abstract method 2");
	}
	
	 abstract void test2(); // abstract method		- QA (India)
	 abstract void test3();
	 abstract void test3(int a); // abstract method overloading



	public static void main(String[] args) {
//		AbstractClassConcept acc = new AbstractClassConcept(); // not allowed to instantiate/create object of the class
	}

}
