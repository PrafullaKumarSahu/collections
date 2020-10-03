/**
 * 
 */
package collections.sortingLists;

import java.util.Comparator;

/**
 * @author prafullakumarsahu
 *
 */
public class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		if (str1.length() > str2.length()) {
			return 1;
		}
		
		if(str1.length() < str2.length()) {
			return -1;
		}
		return 0;
	}
}
