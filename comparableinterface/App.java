/**
 * 
 */
package collections.comparableinterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
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
		List<Person> personsList = new ArrayList<Person>();
		Set<Person> personsSet = new TreeSet<Person>();
		
		addMembersToCollection(personsList);
		addMembersToCollection(personsSet);
		
		Collections.sort(personsList);
		
		System.out.println(personsList);
		System.out.println(personsSet);
	}

	private static void addMembersToCollection(Collection<Person> person) {
		person.add(new Person("Kabib"));
		person.add(new Person("Cornor"));
		person.add(new Person("Tony"));
		person.add(new Person("Dustin"));
		person.add(new Person("Justin"));
	}

}
