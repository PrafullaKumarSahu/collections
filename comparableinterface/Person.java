/**
 * 
 */
package collections.comparableinterface;

/**
 * @author prafullakumarsahu
 *
 */
public class Person implements Comparable<Person>{

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	@Override
	public int compareTo(Person p) {
		int nameLength1 = name.length();
		int nameLength2 = p.name.length();
		
		if (nameLength1 > nameLength2) {
			return 1;
		}
		if (nameLength1 < nameLength2) {
			return -1;
		}
		return name.compareTo(p.name); // if list will be having names of same length will determine they were same or different
	}

	//Alphabetical comparison
//	@Override
//	public int compareTo(Person p) {
//		return name.compareTo(p.name);
//	}
	
	

}
