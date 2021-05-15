package oOPSconcept;

public class UsingEncapsulationConcept {

	public static void main(String[] args) {
		EncapsulationConcept ec = new EncapsulationConcept();
		
		ec.ssn = "11234234234";
		System.out.println(ec.ssn);
		
		ec.setUsername("test123");
		System.out.println("Provide username: "+ec.getUsername());
		
		ec.setPassword("1234");
		System.out.println("Provide password: "+ec.getPassword());
		
		System.out.println("Provide ssn: "+ec.ssn);

	}

}
