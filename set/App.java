/**
 * 
 */
package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//HashSet
		Set<String> reptiles = new HashSet<String>();
		reptiles.add("Snakes");
		reptiles.add("Turtles");
		reptiles.add("Lizards");
		reptiles.add("Crocodiles");
		reptiles.add("Dinosaurs");
		
		//Duplicate are not added
		reptiles.add("Snakes");
		
		//HashSets do not retains order
		System.out.println(reptiles);
		
		
		//LinkedHashSet
		Set<String> snakes = new LinkedHashSet<String>();
		snakes.add("Python");
		snakes.add("Cobra");
		snakes.add("Mambas");
		snakes.add("Anaconda");
		snakes.add("Taipan");
		
		//Duplicates are not added
		snakes.add("Python");
		
		//LinkedHashSet retains the order in which they are added
		System.out.println(snakes);
		
		
		//TreeSet
		Set<String> lizards = new TreeSet<String>();
		lizards.add("Mosasaurs");
		lizards.add("Dolichasaurs");
		lizards.add("Adriosaurs");
		lizards.add("Mosasaurus");
		lizards.add("Aigialosaurs");
		
		//Duplicates are not added
		lizards.add("Dolichasaurs");
		
		//TreeSet keeps elements in natural order
		System.out.println(lizards);
		
		//Iterate through set
		for(String reptile: reptiles) {
			System.out.println(reptile);
		}
		
		//Does set contains an element
		System.out.println(reptiles.contains("Snakes"));
		
		//Check if set is empty
		System.out.println(reptiles.isEmpty());
		
		Set<String> reptiles2 = new LinkedHashSet<String>();
		reptiles2.add("Hylonomous");
		reptiles2.add("Snakes");
		reptiles2.add("Gekota");
		reptiles2.add("Lizards");
		reptiles2.add("Chameleons");
		
		//Intersection of two sets
		Set<String> commonReptilesSet = new HashSet<String>(reptiles);
		commonReptilesSet.retainAll(reptiles2);
		System.out.println(commonReptilesSet);
		
		//Difference of two sets
		Set<String> differentReptilesSet = new HashSet<String>(reptiles);
		differentReptilesSet.removeAll(reptiles2);
		System.out.println(differentReptilesSet);
		
	}

}
