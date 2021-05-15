package oOPSconcept;

public class UnderstandingInterface implements InterfaceConcept, SecondInterface{

	public static void main(String[] args) {
		

	}

	@Override
	public void test1() {
		System.out.println("test1");	
	}

	@Override
	public void test2() {
		System.out.println("test2");
	}

	@Override
	public void test3() {
		System.out.println("test 3");
	}

	@Override
	public void test3(int a) {
		System.out.println("test 3"+a);
	}

	@Override
	public void method1() {
		System.out.println("method 1");
	}

	@Override
	public void method2() {
		System.out.println("method 2");
	}

}
