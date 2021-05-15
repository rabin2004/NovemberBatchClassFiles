package testingJava;

import java.util.Scanner;

public class ScannerConcept {
	
	// Scanner -> handles/provides to accept user provided data

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // System.in -> allows to read and accept data
		
		System.out.print("Enter First Name: ");
		String firstName = scan.nextLine(); // nextLine() -> except String values
		System.out.println("Enter Last Name: ");
		String lastName = scan.next();
		System.out.println("Age: ");
		int age = scan.nextInt();
		
//		System.out.println("Your name is "+firstName+"! Welcome back!");
		
		if(firstName.equalsIgnoreCase("John") && lastName.equalsIgnoreCase("Ben")) {
			System.out.println("Your name is "+firstName+lastName+". You are "+age+" yours old."+" Welcome back!");
		}
		else {
			System.out.println("Not a valid user.");
		}
		
		if(age>30) {
			System.out.println("Do you want to apply for morgage?");
		}
		else if(age<30) {
			System.out.println("Apply credit card today!");
		}
		else {
			System.out.println("Welcome!");
		}
		

	}
	
	// Assignment:
//		1. Accept values using Scanner: Username/Password
//		2. Store values in arrays
//		3. Extract values - using loops
//		4. Verify values using - conditions
//		5. Based on the condition provide some execution or output
//		6. Method types

}
