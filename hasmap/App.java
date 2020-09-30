/**
 * 
 */
package collections.hasmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>(); // keys are unique, values can be duplicate
		//HashMap does not maintains order
		map.put(10, "Ten");
		map.put(2, "Two");
		map.put(3, "Thirty");
		map.put(4, "Four");
		map.put(5, "Five");
		
		String text = map.get(4);
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("Key: " + key + " - value: " + value);
		}

	}

}
