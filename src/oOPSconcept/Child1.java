package oOPSconcept;

public class Child1 extends Parent{ // subClass extends superClass
	
		static String ch1 = "child variable";
		
		static void childMethodOverriding1() {
			System.out.println("Child method 1 - overriding");
		}
		
		static void childMethodOverriding2() {
			System.out.println("Child method 2 - overriding");
		}

	public static void main(String[] args) {
		// parent class (static)
		System.out.println(b);
		parentMethod2();
		
		Child1 ch = new Child1();
		// parent class (non-static)
		System.out.println(ch.a);
		ch.parentMethod1();
		
		// grandParent class (static)
		System.out.println(boo);
		grandParent2();
		
		// grandParent class (non-static)
		System.out.println(ch.d);
		ch.grandParent1();
		
		
		// Method Overriding: calling overridden methods
		childMethodOverriding1();
		ch.childMethodOverriding2();
		
		
		// Polymorphims: object can have different form
		// Child1 ch = new Child1();
		Parent pach = new Child1(); // object referring to parent class -> with which overriden method can be visible/called
		pach.childMethodOverriding1();
		pach.childMethodOverriding2();
		
		GrandParent gpch = new Child1();
		gpch.childMethodOverriding2();

	}

}
