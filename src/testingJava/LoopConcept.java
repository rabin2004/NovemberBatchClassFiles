package testingJava;

public class LoopConcept {
	
	// Looping - repeating an action over an over again without increasing the number of same scripts
		// requirements for loops -> createVariable/condition/increment or decrement
	
		// 1. 'for' loop -> for(createVariable; condition; increment or decrement)
	
		// 2. 'while' loop -> createVariable; while(condition) {increment or decrement;}
	
		// infinite loop -> if loop doesn't stop

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
//		System.out.println(a);
//		System.out.println("2"); // print upto ....100
		
		// Requirements: print 1..to..100
		
		// option 1. 'for' loop
//		for(int i=1; i<=100; i=i+1) { // increment: i=i+1 => i++
//			System.out.print(i+" ");
//		}
		
		// option 2. 'while' loop
//		int i = 1;
//		while(i<=100) {
//			System.out.print(i+" ");
//			i++;
//		}
		
		
		
		// Requirements: print 100..to..1
		
		// option 1. 'for' loop
//		for(int i=100; i>=1; i=i-1) { // decrement: i=i-1 => i--
//			System.out.print(i+" ");
//		}
		
		// option 2. 'while' loop
//		int i = 100;
//		while(i>=1) {
//			System.out.print(i+" ");
//			i--;
//		}
		
		
		
		// Requirement: print 1 to 20 but even numbers
//		for(int i=2; i<=20; i=i+2) {
//			System.out.print(i+" ");
//		}
//		
//		System.out.println("");
//		System.out.println("##############################");
//		
//		int i =2;
//		while(i<=20) {
//			System.out.print(i+" ");
//			i=i+2;
//		}
		
		
		
		// Requirement: print 20 to 1 but odd numbers
//		for(int i=19; i>=1; i=i-2) {
//			System.out.print(i+" ");
//		}
		
//		int i = 19;
//		while(i>=1) {
//			System.out.print(i+" ");
//			i=i-2;
//		}
		
		int x = 20;
		
		// Requirement: print 30 to 50 odd numbers
//		for(int i=x+11; i<=50; i=i+2) {
//			System.out.print(i+" ");
//		}
		
		x=x+11;
		while(x<=50) {
			System.out.print(x+" ");
			x=x+2;
		}
		
		
		
		
		
		
		
		

	}
	// Assignment:
//		1. print 200-1000, even number and odd number
//		2. using for and while loop
//		3. inside the loop - compare if the number is 555 then print pass, if number is 888 print pass if not fail

}
