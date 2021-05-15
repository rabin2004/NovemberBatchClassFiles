package testingPack;

public class Test1 {
	
	static int a = 50;
	int b = 20;
	
	int addition(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static void substraction() {
		Test1 t = new Test1();
		int c = a-t.b;
		System.out.println(c);	
	}

	public static void main(String[] args) {
		substraction();
		
		Test1 t = new Test1();
		System.out.println(t.addition(20, 70));

	}

}
