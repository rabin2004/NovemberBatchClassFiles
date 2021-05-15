package oOPSconcept;

public class Child2 extends Parent{

	public static void main(String[] args) {
		System.out.println(b);
		parentMethod2();
		
		Child2 ch2 = new Child2();
		
		System.out.println(ch2.a);
		ch2.parentMethod1();
		
		System.out.println(boo);
		grandParent2();
		
		System.out.println(ch2.d);
		ch2.grandParent1();

	}

}
