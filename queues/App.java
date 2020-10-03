/**
 * 
 */
package collections.queues;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author prafullakumarsahu
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// (head) <- ooooooooooo <- (tail) [First-In-First-Out FIFO]
		
		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(3);
		
		queue.add(10);
		queue.add(100);
		queue.add(1000);
		
		System.out.println("Head of the queue is: " + queue.element()); //Head of the queue

		try {
			queue.add(10);
		} catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		
		for(Integer i:queue) {
			System.out.println(i);
		}
		
		int removedFirst = queue.remove();
		System.out.println("Removed Item is: " + removedFirst);
		int removedSecond = queue.remove();
		System.out.println("Removed Item is: " + removedSecond);
		int removedThird = queue.remove();
		System.out.println("Removed Item is: " + removedThird);
		
		try {
			int removed = queue.remove();
		} catch(NoSuchElementException e) {
			System.out.println("No such element found, seems queue do not have items now.");
		}
		
		try {
			System.out.println(queue.element());
		} catch(NoSuchElementException e) {
			System.out.println("No such element found, seems queue do not have items now.");
		}
		
		Queue<Integer> queue2 = new ArrayBlockingQueue<Integer>(3);
		queue2.offer(10);
		queue2.offer(100);
		queue2.offer(1000);
		
		System.out.println("Head of the queue 2 when there are items: " + queue2.peek());
		
		if (queue2.offer(10000) == false) { //offers return boolean success status
			System.out.println("Exceeds the size of queue, can not add more.");
		}
		
		System.out.println("Removed item is: " + queue2.poll());
		System.out.println("Removed item is: " + queue2.poll());
		System.out.println("Removed item is: " + queue2.poll());
		System.out.println("Removed item is: " + queue2.poll()); // returns null when no more value
		System.out.println("Head of the queue 2 when there is no item: " + queue2.peek());
	}

}
