package testingJava;

public class IfElseConditionConcept {
	
	// IF-Else condition: -> creating verification(check) point , verification point itself is not going to decide pass or fail
		// If - compares with condition provided, if true then codes inside will be executed
		// Else - condition inside if comes out to be false, then codes inside else will be executed
		// Else If - increasing the number condition
	

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
//		if(a>b) {
//			System.out.println("a is more than b");
//		}
//		else {
//			System.out.println("a is less than b");
//		}
		
//		if(b<=c) {
//			System.out.println("b is less than or equal to c");
//		}
//		else {
//			System.out.println("b is more than c");
//		}
		
		String username = "test123";
		String password = "1234";
		
//		if(username.equals("Test123")) {
//			System.out.println("Provide access. Login Successful");
//		}
//		else {
//			System.out.println("Login failed. Reenter valid username");
//		}
		
//		String inputUsername = "TEST_123";
//		
//		if(username.equals(inputUsername)) {
//			System.out.println("Login successful.");
//		}
//		else if(username.equalsIgnoreCase(inputUsername)) {
//			System.out.println("Login successful");
//		}
//		else {
//			System.out.println("Access denied.");
//		}
		
		int i = 4;
		int j = 5;
		int k = 6;
		
		if(i>j) {
			System.out.println("j is less than i");
		}
		else if(j>k) {
			System.out.println("k is less than j");
		}
		else if(k<i) {
			System.out.println("i is less than k");
		}
		else {
			System.out.println("i is the smallest number");
			System.out.println("k is the largest number");
		}
		

	}
	
	//Assignment:
//		1. String a, b, c -> "word", "WORD", "Word"  or numbers
//		2. if else condition - compare and check if these same string or different string
//		3. if same - execute some codes
//		4. if not true then changes the string to make it same
//		5. else string is different

}
