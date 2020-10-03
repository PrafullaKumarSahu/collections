/**
 * 
 */
package collections.sortingLists;

/**
 * @author prafullakumarsahu
 *
 */
public class Person {
	private String name;
	private int ID;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}


	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}


	/**
	 * @param name
	 * @param iD
	 */
	public Person(String name, int iD) {
		super();
		this.name = name;
		ID = iD;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", ID=" + ID + "]";
	}	
}
