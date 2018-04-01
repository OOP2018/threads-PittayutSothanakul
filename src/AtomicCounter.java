import java.util.concurrent.atomic.AtomicLong;

/**
 * The class is Counter by using AtomicLong.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class AtomicCounter extends Counter {
	private AtomicLong total;

	/**
	 * Initialize total of the number.
	 */
	public AtomicCounter() {
		total = new AtomicLong();
	}

	/**
	 * Add amount to the total.
	 */
	public void add(int amount) {
		total.getAndAdd(amount);
	}

	/**
	 * return the total of value.
	 */
	public long get() {
		return total.get();
	}
}
