package testingJava;

public class StringManipulationConcept2 {

	public static void main(String[] args) {
		
		// toUpperCase(), toLowerCase(), equals(), equalsIgnoreCase(), compareTo(), compareToIgnoreCase()
		// length(), indexOf(), lastIndexOf(), charAt(), replace(), replaceAll(), concat(), contains(), trim(), substring()
		// split()
		
		String a = "I am taking QA training with TFT."; //33
		String b = "I am taking QA training with TFT.I am taking QA training "
				+ "with TFT.I am taking QA training with TFT.I am taking QA "
				+ "training with TFT.I am taking QA training with TFT.I am "
				+ "taking QA training with TFT.I am taking QA training with TFT."
				+ "I am taking QA training with TFT.I am taking QA training with "
				+ "TFT.";
		
		// length() -> counting length of string
//		System.out.println("Length of string a: "+a.length());
//		System.out.println("length of string b: "+b.length());
		
		// indexOf() -> first position of a character
//		System.out.println("Position of Q in string a: "+a.indexOf('Q'));
//		System.out.println("First occurence of T: "+a.indexOf('T'));
		
		// lastIndexOf() -> last occurrence of a character
//		System.out.println("Last occurence of T: "+a.lastIndexOf('T'));
		
		// charAt() -> Identifying character at specific position
//		System.out.println("Character at 5th position: "+a.charAt(5));
		
		// replace() -> changing old character with new
//		System.out.println(a.replace('Q', 'q'));
		
		// replaceAll() -> changing all that old character with new character
//		System.out.println(a.replaceAll(" ", ""));
//		System.out.println(a.replaceAll("i", "I"));
//		System.out.println(a.replaceAll("TFT", "Transfotech"));
		
		// concat() -> combine strings
		String c = " I am learning Java.";
		String concatenatedString = a.concat(c);
//		System.out.println(concatenatedString);
//		System.out.println(a+c); 
		
		// contains() -> check if the specific string (specific to upper/lower case) is present within a desired string
//		System.out.println("If Java is present in string c: "+c.contains("Java"));
		
		// trim() -> remove spaces before and after string
		String d = "                Good Morning               ";
//		System.out.println(d.length());
		
		String trimmedStringD = d.trim();
//		System.out.println("Trimmed string: "+trimmedStringD);
//		System.out.println(trimmedStringD.length());
		
		// subString() - gives piece of a string 
//		System.out.println(trimmedStringD.substring(5)); // from 5th position onward
		System.out.println(trimmedStringD.substring(2, 5)+"."); // from 2nd postion and before 5th position
		System.out.println(trimmedStringD.substring(0, 4));
	}

}
