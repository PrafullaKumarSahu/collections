/**
 * 
 */
package collections.implementingiterable;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UrlLibrary urlLibrary = new UrlLibrary();
		
		for(String html: urlLibrary) {
			//System.out.println(html.length());
			System.out.println(html);
		}
	}

}
