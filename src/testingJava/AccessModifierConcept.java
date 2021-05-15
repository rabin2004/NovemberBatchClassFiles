package testingJava;

public class AccessModifierConcept { // not allowed to define class private/protected, only allowed public/abstract/final/default
	
	//Access Modifier - 4 Types - restricting access of a class
		//1. Default - Visible to the package, the default. No modifiers are needed. - can be accessed in same class/class in same package/but not in class of different package
		//2. private - Visible to the class only (private). - can only be accessed within the class
		//3. public - Visible to the world (public). - can be accessed in same class/class in same package/class in different
		//4. protected - Visible to the package and all subclasses (protected). - can be accessed in same class/class in same package/not in class of different package
		
		// default Vs protected - protected property can also be accessed in subClasses/ default can't accessed in subClasses
		// How to prevent object instantiation (creation) of a class? -> in package level by using default/final
	
		public String a = "Hello"; // any access modifier can also be used in global variable
		
		static void test1() { // default access modifier
			System.out.println("Default access method");
		}
		
		private static void test2() {
			System.out.println("Private access method");
		}
		
		public static void test3() {
			System.out.println("Public access method");
		}
		
		protected static void test4() {
			System.out.println("Protected access method");
		}

	public static void main(String[] args) {
		test1(); // default access modifier can be accessed locally
		test2(); // private access modifier can only be accessed locally
		test3(); // public access modifier can only be accessed locally
		test4(); // public access modifier can only be accessed locally
	}

}
