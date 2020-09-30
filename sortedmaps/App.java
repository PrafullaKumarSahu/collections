/**
 * 
 */
package collections.sortedmaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap("HashMap", hashMap); // random order
		testMap("LinkedHashMap", linkedHashMap); //The order elements are inserted
		testMap("TreeMap", treeMap); // natural integer/ character order (0, 1, 2, 3 | A, B, C, D | a, b, c, d)
	}

	private static void testMap(String mapType, Map<Integer, String> map) {
		map.put(9, "Nine");
		map.put(99, "Ninty Nine");
		map.put(19, "Nineteen");
		map.put(1, "One");
		map.put(11, "Eleven");
		map.put(17, "Seventeen");
		map.put(96, "Ninty Six");
		System.out.println(mapType + ":");
		for(Integer key: map.keySet()) {
			System.out.println("key: " + key + " - value: " + map.get(key));
		}
		
	}

}
