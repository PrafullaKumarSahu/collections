/**
 * 
 */
package collections.sortingLists;

import java.util.Comparator;

/**
 * @author prafullakumarsahu
 *
 */
public class ReverseAlphabeticalOrderComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return -str1.compareTo(str2);
	}

}
