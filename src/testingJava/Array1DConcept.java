package testingJava;

public class Array1DConcept {
	
	// Array -> stores multiple datas/ needs DataTypes, ReferenceName & Size of array/ '[]' after dataType or referenceName
	// 1D array -> 1 column multiple rows

	public static void main(String[] args) {
		// variable creation
		int a = 1;
		int b = 2;
		
		// Option.1 => creating 1D array || int[] -> integer array
		int[] arr = new int[5];
		// assiging values into each cell of array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
//		arr[5] = 60; // if size changed to int[7]
//		arr[6] = 70;
		
//		System.out.println(arr[2]);
//		System.out.println(arr[4]);
//		System.out.println(arr[5]); // ArrayIndexOutOfBoundsException -> Index 5 out of bounds for length 5
		
//		System.out.println(arr[1]+arr[4]);
//		System.out.println(arr[3]>=arr[4]);
//		
//		System.out.println("Size of array: "+arr.length); // .length => size of array
		
		// traversing array to get all the values out => loopConcept
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println(" ");
//		System.out.println("#########");
//		int i=0;
//		while(i<arr.length) {
//			System.out.print(arr[i]+" ");
//			i++;
//		}
		
		// option 2: to create 1D-array
		// no restriction of size of array, easy insertion of data, creation of array & insertion of data happening same line
		String stringArray[] = {"QA","Manual QA", "Automation QA", "SDET", "DevOps"};
		
		System.out.println("Size of array: "+stringArray.length);
		System.out.println(stringArray[4]);
		
		for(int i=0; i<stringArray.length; i++) {
			System.out.print(stringArray[i]+"||");
		}
	
		
				

	}

}
