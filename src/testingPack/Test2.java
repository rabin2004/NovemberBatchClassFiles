package testingPack;

public class Test2 {
	
	int a = 10;
	static int b = 20;
	
	private void division() {
		int c = b/a;
		System.out.println(c);
	}
	
	protected static int multiplication(int a, int b) {
		int c = a*b;
		return c;	
	}

	public static void main(String[] args) {
		System.out.println(multiplication(20, 10));
		
		Test2 t = new Test2();
		t.division();

	}

}
