package testingJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList(); // Raw type ArrayList/non-parametrized ArrayList -> no restriction to insert different dataTypes value
		
		// add() -> insert datas into arrayList
		al.add("Tom");
		al.add(29);
		al.add(true);
		al.add(10.99);
		al.add('A');
		
		ArrayList<String> al1 = new ArrayList<String>(); // Parametrized ArrayList -> restricted to dataTyped defined
		al1.add("Harry");
		al1.add("John");
		al1.add("Marry");
		al1.add("Tisa");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Harry");
		al2.add("John");
		al2.add("Marry");
		al2.add("Tisa");
		
//		al1.add(35); // not allowed/ dataType mismatch
		
//		System.out.println(al);
		
		// size() -> number of rows
//		System.out.println(al.size());
		
		// get() -> extract value
//		System.out.println(al.get(0));
		
		// contains() -> check if present/ boolean output
		System.out.println(al1.contains("John"));
		
		// equals() -> comparing 2 arrayList/ boolean output 
		System.out.println(al1.equals(al2));
		
		// indexOf() -> return index of the value provided
		System.out.println(al1.indexOf("Marry"));
		
		// isEmpty() -> checks if any values present in arrayList/ boolean output
		System.out.println(al1.isEmpty());
		
		// remove() -> remove value from the row/ row will be removed as well along with value
		al1.remove(1);
		System.out.println(al1);
		
		// 1. option loop concept => to traverse ArrayList
		// for/while loop -> to traverse ArrayList
//		for(int i=0; i<al.size(); i++) {
//			System.out.print(al.get(i)+"|");
//		}
//		
//		System.out.println();
//		
//		int i=0;
//		while(i<al.size()) {
//			System.out.print(al.get(i)+"-");
//			i++;
//		}
		
		// 2. option forEach loop concept => to traverse ArrayList
		// for each loop -> parameterized arrayList
//		for(String name: al1) {
//			System.out.print(name+"|");
//		}
		
		// for each loop -> non-parameterized arrayList
//		for(Object a: al) {
//			System.out.print(a+"|");
//		}
		
		// 3. option Iterator concept => to traverse ArrayList
		Iterator<String> it = al1.iterator();
		
//		String firstRowData = it.next();
//		System.out.println(firstRowData);
//		System.out.println(it.next());
		
//		while(it.hasNext()) {
//			System.out.print(it.next()+"|");
//		}
		
		
		
	}

}
