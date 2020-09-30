/**
 * 
 */
package collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
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
		//ArrayList manages array internally, traversing, accessing element is fast, adding element at end is fast
		//makes the size, when the size exceeds 
		//[0][1][2][3][4][5]
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		//LinkedList consists of element when each element is reference to next elements and vice versa
		//[0]->[1]->[2]->[3]->[4]
		//   <-   <-   <-   <-
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		doSomething("ArrayList", arrayList);
		doSomething("LinkedList", linkedList);

	}

	private static void doSomething(String lsitType, List<Integer> list) {
		for (int i=0; i<1E5; i++) {
			list.add(i);
		}
		//Adding element at end
		long start = System.currentTimeMillis();
		for (int i=0; i<1E5; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken when adding element at end of " + lsitType +":" + (end-start));
		
		//Adding element at start
		long startTime = System.currentTimeMillis();
		for (int i=0; i<1E5; i++) {
			list.add(0, i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken when adding element at start of " + lsitType + ":" + (endTime-startTime));
		
		//Near to end of the list
		long startingTime = System.currentTimeMillis();
		for (int i=0; i<1E5; i++) {
			list.add(list.size() - 100, i);
		}
		long endingTime = System.currentTimeMillis();
		System.out.println("Time taken when adding element at near the end of " + lsitType + ":" + (endingTime-startingTime));
		
	}

}
