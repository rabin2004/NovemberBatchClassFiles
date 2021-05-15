package testingJava;

public class Array2DConcept {
	
	//2D Array = multiple columns
	    //[row][column]

	public static void main(String[] args) {
		// creating 2D array
//		char arrayCharacter[][] = new char[5][2];
//		// inserting values in it
//		//1st row
//		arrayCharacter[0][0] = 'a';
//		arrayCharacter[0][1] = 'b';
//		//2nd row
//		arrayCharacter[1][0] = 'c';
//		arrayCharacter[1][1] = 'd';
//		//3rd row
//		arrayCharacter[2][0] = 'e';
//		arrayCharacter[2][1] = 'f';
//		//4th row
//		arrayCharacter[3][0] = 'g';
//		arrayCharacter[3][1] = 'h';
//		//5th row
//		arrayCharacter[4][0] = 'i';
//		arrayCharacter[5][1] = 'j';
		
		char arrayCharacter[][] = {{'a','b'},{'c','d'},{'e','f'},{'g','h'},{'i','j'}};
		
//		System.out.println(arrayCharacter[3][1]);
//		System.out.println(arrayCharacter[0][0]+" "+arrayCharacter[4][1]);
		
//		System.out.println("Number of rows: "+arrayCharacter.length); // number of rows
//		System.out.println("Number of column: "+arrayCharacter[0].length); // number of columns
		
		// traversing into 2D array -> using 2 for loops: 1st for loop for row & 2nd for loop or column
//		for(int i=0;i<arrayCharacter.length; i++) { // traverses through rows
//			for(int j=0; j<arrayCharacter[i].length; j++) { // traverses through column
//				System.out.print(arrayCharacter[i][j]+"|");
//			}
//		}
		

		int arrayInt[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		
		System.out.println("Number of rows: "+arrayInt.length); // number of rows
		System.out.println("Number of column: "+arrayInt[0].length); // number of columns
		
		for(int i=0;i<arrayInt.length; i++) { // traverses through rows
			for(int j=0; j<arrayInt[i].length; j++) { // traverses through column
				System.out.print(arrayInt[i][j]+"|");
			}
		}
		
		
		// Assignment:
//			1. 1D array => FirstName, LastName, DOB, Age then traverse through using both for & while loop to extract data
//			2. 2D array => Customer Name, email address, phone number then traverse through it using for loop to extract data -> try while as well	
		
		
		
		
		
		
		
		
		

	}

}
