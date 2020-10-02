/**
 * 
 */
package collections.AddingObjectsToSetAndMap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//To Map
		Person person1 = new Person("Su", 21);
		Person person2 = new Person("Xu", 32);
		Person person3 = new Person("Zu", 23);
		Person person4 = new Person("Hu", 34);
		Person person5 = new Person("Zu", 23);
		
		
		Map<Person, Integer> persons = new LinkedHashMap<Person, Integer>();
		persons.put(person1, 1);
		persons.put(person2, 2);
		persons.put(person3, 3);
		persons.put(person4, 4);
		persons.put(person5, 5);
		
		for (Person person: persons.keySet()) {
			System.out.println(person);
		}
		
		Set<Person> personsSet = new LinkedHashSet<Person>();
		personsSet.add(person1);
		personsSet.add(person2);
		personsSet.add(person3);
		personsSet.add(person4);
		personsSet.add(person5);
		
		System.out.println(personsSet);
		
	}

}
