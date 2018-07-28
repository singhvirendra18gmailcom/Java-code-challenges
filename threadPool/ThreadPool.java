package threadPool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;

public class ThreadPool {
	int nThread;
	Worker[] workers;
	LinkedBlockingQueue<Runnable> tasksQueue;
	Logger logger = Logger.getLogger("ThreadPool");

	public ThreadPool(int nThread) {
		this.nThread = nThread;
		workers = new Worker[nThread];
		tasksQueue = new LinkedBlockingQueue<>();

		for (int i = 0; i < nThread; i++) {
			workers[i] = new Worker();
			workers[i].start();
		}
	}
	
	public void execute(Runnable task) {
		synchronized (tasksQueue) {
			tasksQueue.add(task);
			tasksQueue.notifyAll();
		}
	}

	private class Worker extends Thread {
		Runnable task;

		@Override
		public void run() {
			while (true) {
				synchronized (tasksQueue) {
					while (tasksQueue.isEmpty()) {
						try {
							tasksQueue.wait();
						} catch (InterruptedException e) {
							logger.info("thread pool is intruppted due to " + e.getMessage());
						}
					}
					task = tasksQueue.poll();
				}
				try {
					task.run();
				} catch (RuntimeException re) {
					logger.info("thread pool is intruppted due to " + re.getMessage());
					System.out.println("thread pool is intruppted due to " + re.getMessage());
				}
			}

		}
	}
}

