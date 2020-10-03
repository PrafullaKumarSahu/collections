/**
 * 
 */
package collections.itteratorinterface;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//traversing using Iterator interface
		Iterator<Integer> numbers = list.iterator();
		
		while(numbers.hasNext()) {
			Integer current = numbers.next();
			if (current%2 == 0) {
				current++;
			}
			System.out.println(current);
		}
		
		//Modern traversing using foreach loop
//		for(Integer i: list) {
//			System.out.println(i);
//		}
	}

}
