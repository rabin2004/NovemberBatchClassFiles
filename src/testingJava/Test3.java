package testingJava;

import testingPack.Test1;
import testingPack.Test2;

public class Test3 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		
		t1.substraction(); // public method
//		t2. // nothing can be acccessed due to default/private/protected access modifer
		

	}

}
