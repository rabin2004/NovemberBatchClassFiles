package testingJava;

public class TestingAccessModifier {

	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept(); // Class within same packaged: creating object of a class -> able to create object of default class/public class
		amc.test1(); // default access modifier can be accessed in class within same package
//		amc.test2(); // private access modifier can not be access in class within same package
		amc.test3(); // public access modifier can be accessed in class within same package
		amc.test4(); // protected access modifier can be accessed in class within same package
		

	}

}
