package testingJava;

public class Car {
	
	// Creating variables (State)
	public static int door = 4;
	public static int wheels = 4;
	public static String engine = "V6";
	
	// Behaviors (methods/functions)
	public static void run() {
		System.out.println("Car runs");
	}
	
	public static void stop() {
		System.out.println("Car stops");
	}

	public static void main(String[] args) {
		// creating object of a class
		Car BMW = new Car();
		
		System.out.println("Number of doors in BMW: "+BMW.door);
		System.out.println("Number of wheels in BMW: "+BMW.wheels);
		BMW.run();
		BMW.stop();
		
		Car Toyota = new Car();
		System.out.println("Number of doors in Toyota: "+Toyota.door);
		Toyota.run();
		
	}

}
