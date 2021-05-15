package testingJava;

public class DataOperationConcept {

	public static void main(String[] args) {
		// creating variables
		int baseSalary = 5000;
		int bonus = 1500;
		
		int totalSalary = baseSalary+bonus; // '+' -> addition 
		
//		System.out.println(totalSalary);
//		System.out.println("John's total salary per month: $"+totalSalary); // '+' -> place
		
		System.out.println(baseSalary+bonus);
		
		// java execution happens - left to right & top to buttom
		System.out.println("John's total salary per month: $"+baseSalary+bonus); // '+' -> concatenation
		System.out.println("John's total salary per month: $"+(baseSalary+bonus));
		
		System.out.println(baseSalary+bonus+": John's total salary per month");
		

	}
	// Assignment:
//		1. go through dataTypes
//		2. create multiple variables
//		3. do mathematical operation between variables
//		4. concatenation operation
//		5. println vs print
//		6. commentings

}
