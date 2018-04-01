/**
 * AddTask adds number 1 ... limit to the counter, then exits.
 * 
 * @author Pittayut Sothanakul
 */
public class AddTask implements Runnable {
	private Counter counter;
	private int limit;

	/**
	 * Initialize counter and limit number.
	 * 
	 * @param counter
	 *            is the number in the task.
	 * @param limit
	 *            is latest number in the task.
	 */
	public AddTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}

	/**
	 * add number by 1
	 */
	public void run() {
		for (int k = 1; k <= limit; k++)
			counter.add(k);

	}
}