package testingJava;

public class DataTypesConcept {
	
	// main method/function - main() -> Java application execution only possible with main method
	
	// Creating Variables -> DataTypes/ReferenceName/Data
	// DataTypes: 1. Primitive data types 		2. Reference/Object data types
	
	// Primitive data types - int, long, double, float, boolean, char, (byte, short)
	
	public static void main(String[] args) { // body of method
		
		// int (integer) -> whole numerical values (+/-)
		int num1 = 100;
		
		// long -> big whole numberical values (+/-)
		long num2 = 1000000000000000000L;
		
		// float -> numerical values with decimal, less number of decimal
		float num3 = 25.55f;
		
		// double -> numerical values with decimal, big decimal
		double num4 = 60.454567d;
		
		// boolean -> true or false
		boolean A = true;
		
		// char (character) -> single letter or number
		char character1 = 'A';
		char character2 = '5';
		
		// Object dataType -> String = can hold any alphabetic or numeric or alphanumeric or special characters values inside ""
		String script1 = "1234 $$$### Learning Java is fun";
		
		// print statement
		System.out.println(num1); // ln - next line
		// shortcut for println -> type sysout->ctrl+space
		System.out.println(num2);
		
		// println vs print
		System.out.print(script1);
		System.out.print(num4);
	}

}
