/**
 * 
 */
package collections.sortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		
		/**     Sorting String        */
		List<String> animals = new ArrayList<String>();
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Bear");
		animals.add("Elephant");
		animals.add("Dear");
		animals.add("Monkey");
		
		//Sort based on length of string
		//Collections.sort(animals, new StringLengthComparator());
		
		/*
		 * Dictionary order
		 same behavior as Collections.sort(animals);
		*/
		//Collections.sort(animals, new AlphabeticalOrderComparator());
		
		//Reverse Alphabetical order
		Collections.sort(animals, new ReverseAlphabeticalOrderComparator());
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		/**     Sorting Integer        */
		ArrayList<Integer> integers = new ArrayList<Integer>();
		integers.add(15);
		integers.add(25);
		integers.add(5);
		integers.add(35);
		integers.add(75);
		integers.add(55);
		//Collections.sort(integers);
		//Implementing the same thing using anonymous comparator class
		
		/*Collections.sort(integers, new Comparator<Integer>(){

			@Override
			public int compare(Integer int1, Integer int2) {
				// TODO Auto-generated method stub
				return int1.compareTo(int2);
			}
			
		});*/
		
		
		//Reverse natuaral sorting
		Collections.sort(integers, new Comparator<Integer>() {

			@Override
			public int compare(Integer int1, Integer int2) {
				return -int1.compareTo(int2);
			}
			
		});
		
		
		
		for(Integer integer:integers) {
			System.out.println(integer);
		}
		
		
		/** Sorting random objects  */
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Kabib", 1));
		persons.add(new Person("Tony", 3));
		persons.add(new Person("Dustin", 4));
		persons.add(new Person("Cornor", 2));
		persons.add(new Person("Justin", 5));
		
		System.out.println("Before sorting: ");
		for (Person person:persons) {
			System.out.println(person);
		}
		
		//Sort in order of ID
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if (p1.getID() > p2.getID()) {
					return 1;
				}
				
				if (p1.getID() < p2.getID()) {
					return -1;
				}
				
				return 0;
				
			}
			
		});
		

		System.out.println("After sorting by ID: ");
		for (Person person:persons) {
			System.out.println(person);
		}
		
		//Sort in order of name
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
			
		});
		
		System.out.println("After sorting by name: ");
		for (Person person:persons) {
			System.out.println(person);
		}
	}

}
