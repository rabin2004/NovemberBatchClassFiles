package testingPack;

import testingJava.AccessModifierConcept;

public class TestingAccess {

	public static void main(String[] args) {
		AccessModifierConcept amc = new AccessModifierConcept(); // Class within same packaged: creating object of a class -> public class allowed whereas default class not allowed to create object
//		amc.test1(); // default access modifier can be accessed in class of different package
//		amc.test2(); // private access modifier can not be access in class of different package
		amc.test3(); // public access modifier can be accessed in class of different package
//		amc.test4(); // protected access modifier can not be accessed in class of different package

	}

}
