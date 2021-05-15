package oOPSconcept;

public interface InterfaceConcept {

	// Interface VS Class VS AbstractClass
		// 1. Interface is not a class
		// 2. no need of main method -> as only name of the method/function are defined 
		// 3. all the method are default abstract, can't have non-abstract method
		// 4. Implementation of abstract method of interface can only be done in sub-class (kind of inheritance) -> connection between Interface and Class is done by keyword "implements"
		// 5. class can implement multiple interface => Parent2 -> child <- parent1 (Mutiple Inheritance is allowed between Interface and Class) => child implements parentInterface1, parentInterface2
		// 6. develop child parent relation between interfaces => "extends"
	
	// defining method
	void test1();
	abstract void test2();
	void test3();
	void test3(int a); // Interface - method overloading

}
