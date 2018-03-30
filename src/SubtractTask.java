public class SubtractTask implements Runnable {
	private Counter counter;
	private int limit;

	public SubtractTask(Counter counter, int limit) {
		this.counter = counter;
		this.limit = limit;
	}

	public void run() {
		for (int l = 1; l <=limit; l++)
			counter.add(l *(-1));

	}

}