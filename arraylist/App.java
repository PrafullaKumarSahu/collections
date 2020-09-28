/**
 * 
 */
package collections.arraylist;

import java.util.ArrayList;
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
		list.add("Birds");
		list.add("trees");
		//Traversing through each element list style
		for (String i: list) {
			System.out.println(i);
		}
	}

}
