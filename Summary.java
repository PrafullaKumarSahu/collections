/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author prafullakumarsahu
 *
 */
public class Summary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Consider:
		 * 1. What you need the collection to do?
		 * 2. Are you using the fasted collection for your purpose?
		 * 3. Consider insert, update, retrieve and traverse operations on the collection you are choosing.
		 * */
		
		/** List *****************************************************/
		/**
		 * Stores lists of objects
		 * Duplicates are allowed
		 * Objects remains in the order of insertion
		 * Elements are indexed via an integer
		 * Checking for particular item in list is slow
		 * Looking for an item up by index is fast
		 * Iterating through items is relatively fast
		 * Note: List can be sorted
		 * */
		
		// If you need only add/remove from the end use ArrayList
		ArrayList<Object> aList = new ArrayList<Object>();
		
		// Removing or adding any where else use LinkedList
		LinkedList<Object> lList = new LinkedList<Object>();
		
		
		
		
		/** Set *****************************************************/
		/**
		 * Only stores unique values
		 * Great for removing duplicates
		 * Not indexed unlike Lists
		 * Very fast to check if a particular object exists
		 * If you want to use your own objects, you must implements hashCode() and equals() methods
		 * */
		
		// If order is not important use HashSet, the elements will not be in order
		HashSet<Object> hSet = new HashSet<Object>();
		
		// if you want to preserve the order of insertion to set use LinkedHashSet
		LinkedHashSet<Object> lhSet = new LinkedHashSet<Object>();
		
		// If you want elements in natural order use TreeSet | you must implement Comparable interface for custom type
		// (1, 2, 3, 4, 5 ....| a, b, c, d, e ... etc )
		TreeSet<Object> tSet = new TreeSet<Object>();
		
		
		
		/** Map *****************************************************/
		/**
		 * Key value pairs
		 * Like lookup tables
		 * Retrieving value by key is very fast
		 * Iterating over values in map is very slow, iterating over key is fast
		 * Maps are not optimized for iteration, try avoid using it if iteration is required
		 * If you want to use your own objects, you must implements hashCode() and equals() methods
		 * */
		
		// If you are not concerned about order of keys, use HashMap
		HashMap<Object, Object> hMap = new HashMap<Object, Object>();
		
		// If you want to preserve the insertion order of keys, use LinkedHashMap
		LinkedHashMap<Object, Object> lhMap = new LinkedHashMap<Object, Object>();
		
		// If you want keys in natural order use TreeMap | you must implement Comparable interface for custom type
		// (1, 2, 3, 4, 5 ....| a, b, c, d, e ... etc )
		TreeMap<Object, Object> tMap = new TreeMap<Object, Object>();
		
		// There are also SortedSet and SortedMap interfaces.
		
		/* If you make a class implement Comparable,
		 * objects of that class then have a "natural order" 
		 * and can be sorted. On the other hand, 
		 * an object of a class which implements Comparator can be passed to sorting methods
		 * to decide how to sort some collection of other objects, 
		 * even if those objects do not implement Comparable themselves. 
		 * Comparable gives objects an intrinsic natural order; 
		 * Comparator is a separate, external thing for sorting objects that aren't comparable.
		 */
	}

}
