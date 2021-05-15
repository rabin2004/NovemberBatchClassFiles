package testingJava;

public class ReturnTypeConcept {
	
	public static int addition(int a, int b) { // void as a return type is not returning anything
		int c = a+b;
//		System.out.println(c);
		return c; // method is returning value of c
	}
	
	public static int substraction(int a, int b) {
		int c = b-a;
		return c;
	}
	
	public static void mutiplication(int a, int b) {
		int c = a*b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println(addition(10, 20));
		System.out.println(substraction(50,100));
		System.out.println(addition(50,60)+substraction(40,70));
//		System.out.println(substraction(20,70)+mutiplication(10,20)); // throw error as multiplication method is not returning anything (void)

	}

}
