package oOPSconcept;

public class EncapsulationConcept {
	// Encapsulation - a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit
				// - data inside a capsule / data hiding

		// To achieve encapsulation in Java −
		// 1. Declare the variables of a class as private.
		// 2. Provide public setter and getter methods to modify and view the variables values.
		// 3. every variable must have 2 methods - get and set method
	
		private static String username;
		private static String password;
		String ssn;
		
		public static void setUsername(String Username) {
			username = Username;
		}
		
		public static String getUsername() {
			return username;
		}
		
		public static void setPassword(String Password) {
			password = Password;
		}
		
		public static String getPassword() {
			return password;
		}
		
	public static void main(String[] args) {
		

	}

}
