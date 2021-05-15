package testingJava;

public class ComparativeOperationConcept {

	// Comparative operation -> comparison between values -> output of comparison either "true" or "false"
	// Type of comparative operator -> 
			// 1. "==" -> are they equal
			// 2. "!=" -> are they not equal
			// 3. ">"  -> is a value more than or greater than
			// 4. ">=" -> is a value more than or equal 
			// 5. "<"  -> is a value less than
			// 6. "<=" -> is a value less than or equal
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 10;
		int d = 30;
		
//		System.out.println(a==b); // false
//		System.out.println(a!=b); // true
//		System.out.println(a>b); // false
//		System.out.println(a>=b); // false
//		System.out.println(a<b); // true
//		System.out.println(a<=b); // true
		
		boolean comparisonEqualTo = a==c;
		System.out.println(comparisonEqualTo);
		
		char charA = 'a';
		char charB = 'A';
		
		System.out.println(charA==charB); 
		
		String str1 = "I love Java.";
		String str2 = "I love Java.";
		String str3 = "i love java.";
		
		System.out.println(str1==str2);
		System.out.println(str1!=str3);
		

	}

}
