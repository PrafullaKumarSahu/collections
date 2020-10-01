/**
 * 
 */
package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(10);
		arrList.add(100);
		arrList.add(1000);
		arrList.add(10000);
		
		//Accessing a single element
		System.out.println(arrList.get(2));
		
		//Traversing through each element using for loop
		for (int i=0; i<arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		//Traversing through each element list style
		for (Integer i: arrList) {
			System.out.println(i);
		}
		
		//Removing an element from array list
		//From end | fastest
		arrList.remove(arrList.get(arrList.size()-1));
		
		System.out.println("After removing from end:");
		
		//Traversing through each element list style
		for (Integer i: arrList) {
			System.out.println(i);
		}
		
		//From the beginning | slowest
		arrList.remove(0);
		
		System.out.println("After removing from begining: ");
		//Traversing through each element list style
		for (Integer i: arrList) {
			System.out.println(i);
		}
		
		
		//Using List interface
		List<String> list = new ArrayList<String>();
		list.add("Animals");
		list.add("trees");
		list.add("Birds");
		//Traversing through each element list style
		for (String i: list) {
			System.out.println(i);
		}
		
		/* Sorting the list */
		//Natural sorting
		Collections.sort(list);
		System.out.println(list);
		
		//custom sorting
		list.sort((o1, o2) -> {return (o1.hashCode()-o2.hashCode()); });
		System.out.println(list);
		
		//ArrayList to list conversion
		List<String> letters = new ArrayList<String>();

		// add example
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
		//convert list to array
		String[] strArray = new String[letters.size()];
		strArray = letters.toArray(strArray);
		System.out.println(Arrays.toString(strArray)); // "[A, B, C]"
		
		//convert array to list
		String[] vowels = {"a", "e", "i", "o", "u" };
		List<String> vowelsList = Arrays.asList(vowels);
		System.out.println(vowelsList);
		
		//Traversing through each element of string list
		for (String i: vowelsList) {
			System.out.println(i);
		}
		
		//Appending one list to another
		letters.addAll(vowelsList);
		System.out.println(letters);
		
		//Iterating using while
		Iterator lettersIterator = letters.iterator();
		while(lettersIterator.hasNext()) {
			System.out.println(lettersIterator.next());
		}
	}

}
