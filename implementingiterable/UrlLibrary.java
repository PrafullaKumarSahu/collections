/**
 * 
 */
package collections.implementingiterable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author prafullakumarsahu
 *
 */
public class UrlLibrary implements Iterable<String> {

	private LinkedList<String> urls = new LinkedList<String>();
	
	private class UrlIterator implements Iterator<String> {
		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < urls.size();
		}

		@Override
		public String next() {
			StringBuilder sb = new StringBuilder();
			try(BufferedReader br = new BufferedReader(new InputStreamReader((new URL(urls.get(index))).openStream()))) {
				String line = null;
				
				while((line = br.readLine()) != null) {
					sb.append(line);
					sb.append("\n");
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			index++;
			return sb.toString();
		}
		
	}
	
	public UrlLibrary() {
		urls.add("http://example.com");
		urls.add("http://example.net");
		urls.add("http://example.org");
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new UrlIterator();
	}
	
//	@Override
//	public Iterator<String> iterator() {
//		// TODO Auto-generated method stub
//		return urls.iterator();
//	}
	
	
}
