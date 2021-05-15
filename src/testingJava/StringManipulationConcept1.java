package testingJava;

public class StringManipulationConcept1 {

	public static void main(String[] args) {
		String a = "Hello";
		int b = 100;
		int c = 200;
//		double c = 200; // looks for changes that happens in out
		
		// java execution - left to right
//		System.out.println(a+b+c); // Hello100200
//		System.out.println(c+b+a); // 300Hello
//		System.out.println(b+c+a); // 300Hello
//		System.out.println(b+a+c); // 100Hello200
		
		String i = "HELLO JAVA";
		String j = "HELLO JAVA";
		
		// to access String methods
		String lowerCaseI = i.toLowerCase(); // lower case conversion
//		System.out.println(lowerCaseI);
		
		String UpperCaseI = lowerCaseI.toUpperCase();
//		System.out.println("Converted back to upper case: "+UpperCaseI); // upper case conversion
		
		// comparing strings with operator "==" -> not a good approach
//		System.out.println(i==UpperCaseI); // false
//		System.out.println(i==j); // true
//		System.out.println(UpperCaseI==j); // false
		
		// equals() -> comparing strings, is upperCase & lowerCase sensitive
//		System.out.println("Comparing i to uppercased i: "+i.equals(UpperCaseI)); // true
//		System.out.println("Comparing i to lowercased i: "+i.equals(lowerCaseI));
		
		// equalsIgnoreCase() -> comparing strings, is not upperCase & lowerCase sensitive
//		System.out.println(i.equalsIgnoreCase(lowerCaseI));
//		String k = "HELLO  JAVA";
//		System.out.println(k.equalsIgnoreCase(lowerCaseI));
		
		// compareTo() -> comparing strings, is upperCase & lowerCase sensitive, if same strings then output '0', if string are different then output will not be '0'
 		System.out.println(i.compareTo(UpperCaseI));
		System.out.println(i.compareTo(lowerCaseI));
		
		// compareToIgnoreCase() -> comparing strings, is not upperCase & lowerCase sensitive
		System.out.println(i.compareToIgnoreCase(UpperCaseI));
		System.out.println(i.compareToIgnoreCase(lowerCaseI));
		
		

	}

}
