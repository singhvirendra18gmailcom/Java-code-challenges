package threadPool;

public class Main {

	public static void main(String[] args) {
		ThreadPool pool = new ThreadPool(5);
		for (int i = 0; i < 10; i++) {
			pool.execute(new Task(i));
		}
	}
}

class Task implements Runnable {
	int num;

	public Task(int num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		System.out.println("Stat executing task" + num);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("stop executing task" + num);

	}

}
