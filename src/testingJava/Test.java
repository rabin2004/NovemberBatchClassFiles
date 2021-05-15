package testingJava;

import java.util.Scanner;

public class Test {
	
	public static void verifyCredentials(String firstName, String lastName) {
		if(firstName.equalsIgnoreCase("John") && lastName.equalsIgnoreCase("Ben")) {
			System.out.println("Welcome "+firstName);
		}
		else {
			System.out.println("Access denied.");
		}
	}
	
	public static void displayAccountBalance(String userName, String password) {
		if(userName.equals("John123") && password.equals("12345")) {
			System.out.println("Total account balance "+ 10000);
		}
		else {
			System.out.println("Access denied.");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("First Name: ");
		String firstName = scan.next();
		
		System.out.print("Last Name: ");
		String lastName = scan.next();
		
		System.out.println("UserName: ");
		String userName = scan.next();
		
		System.out.println("Password: ");
		String password = scan.next();

		
		verifyCredentials(firstName, lastName);
		displayAccountBalance(userName, password);
	}

}
