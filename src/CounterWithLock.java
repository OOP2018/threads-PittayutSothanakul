import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * The class is Counter by using Lock.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class CounterWithLock extends Counter {
	private Lock lock = new ReentrantLock();

	/**
	 * Add amount to the total.
	 */
	public void add(int amount) {
		try {
			lock.lock();
			super.add(amount);
		} finally {
			lock.unlock();
		}
	}
}
