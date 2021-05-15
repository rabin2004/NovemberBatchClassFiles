package oOPSconcept;

public class Parent extends GrandParent {
	
	String a = "Hello";
	static int b = 25;
	
	void parentMethod1() {
		System.out.println("Parent method 1");
	}
	
	static void parentMethod2() {
		System.out.println("Parent method 2");
	}
	
	static void childMethodOverriding1() {
		System.out.println("Parent method - overridden method1");
	}
	
	static void childMethodOverriding2() {
		System.out.println("Parent method - overridden method2");
	}

	public static void main(String[] args) {
		System.out.println(boo);
		grandParent2();
		
		Parent pa = new Parent();
		System.out.println(pa.d);
		pa.grandParent1();
		
		// Not allowed to inherit from Child class
//		System.out.println(ch1);
//		childMethod1();
		
		childMethodOverriding1();
		pa.childMethodOverriding2();
		
		

	}

}
