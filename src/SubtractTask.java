/**
 * AddTask Subtract number 1 ... limit to the counter, then exits.
 * 
 * @author Pittayut Sothanakul
 */
public class SubtractTask implements Runnable {
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
	public SubtractTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}

	/**
	 * add number by -1
	 */
	public void run() {
		for (int l = 1; l <= limit; l++)
			counter.add(l * (-1));

	}

}