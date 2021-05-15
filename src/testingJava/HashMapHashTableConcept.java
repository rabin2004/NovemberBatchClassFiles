package testingJava;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapHashTableConcept {
	
//	Hashmap vs Hashtable
//	-> Key & value pair
//	1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
//	2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
//	3. HashMap is generally preferred over HashTable if thread synchronization is not needed

//	Why HashTable doesn’t allow null and HashMap does?
//	To successfully store and retrieve objects from a HashTable, the objects used as keys must implement the hashCode method and the equals method. Since null is not an object, it can’t implement these methods. HashMap is an advanced version and improvement on the Hashtable. HashMap was created later.

	public static void main(String[] args) {
		
		HashMap hm = new HashMap(); // non-parametrized
		hm.put('a', "Tom"); // put() -> insert key & value 
		hm.put('b', 35);
		hm.put(1, true);
		hm.put('d', "John");
		hm.put(null, "Java"); // Take null as key/ one null key is allowed
		hm.put(null, "Selenium");
		hm.put(1, false); // duplicate key is only going to replace values
		hm.put(null, null); // Null key and null value excepted/ One null but numerous null values allowed
		hm.put(5, null);
		
//		System.out.println(hm.get('a')); // get() -> to extract value by pointing towards key
//		System.out.println(hm.entrySet()); // entrySet() -> extract all value in key & value
//		System.out.println(hm.keySet()); // keySet() -> extract all the keys
//		System.out.println(hm.values()); // values() -> extract all the values
//		System.out.println(hm.remove(1)); // remove() -> removes the pair
//		System.out.println(hm.entrySet());
//		hm.replace('d', "Cat"); // replace() -> replaces value
		System.out.println(hm.entrySet());
//		System.out.println(hm.size()); // size() -> count of number of values inserted
//		System.out.println(hm.get(null));
//		System.out.println(hm.get(5));
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>(); // parametrized
		ht.put(1, "Tom"); // put() -> insert key & value 
		ht.put(2, "Tommy");
		ht.put(3, "Harry");
		ht.put(4, "John");
//		ht.put(null, null); // NullPointerException -> null key & null value not allowed
//		ht.put(null, "Tiger"); // NullPointerException -> null key is not allowed
//		ht.put(5, null); // NullPointerException -> null value is not allowed
		
//		System.out.println(ht.get(3));
		System.out.println(ht.entrySet());
//		System.out.println(ht.keySet());
//		System.out.println(ht.values());
//		System.out.println(ht.remove(1));
//		ht.replace(4, "Cat");
//		System.out.println(hm.size());

	}

}
