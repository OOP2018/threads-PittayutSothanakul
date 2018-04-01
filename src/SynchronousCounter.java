/**
 * The class is Counter by using synchronized method.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class SynchronousCounter extends Counter {
	@Override
	/**
	 * Add amount to the total.
	 */
	public synchronized void add(int amount) {
		super.add(amount);
	}
}
