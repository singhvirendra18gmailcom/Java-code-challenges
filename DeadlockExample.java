
public class DeadlockExample {

	public static void main(String[] args) {

		Runnable r1 = () -> {
			System.out.println(Thread.currentThread().getName() + " I will attempt to take String lock");
			synchronized (String.class) {
				System.out.println(Thread.currentThread().getName() + " Hello I have taken lock on String");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " I will attempt to take Integer lock");
				synchronized (Integer.class) {
					System.out
							.println(Thread.currentThread().getName() + " Now I have taken a lock on Integer as well");
				}

			}

		};

		new Thread(r1).start();

		Runnable r2 = () -> {
			System.out.println(Thread.currentThread().getName() + " I will attempt to take Integer lock");
			synchronized (Integer.class) {
				System.out.println(Thread.currentThread().getName() + " Hello I have taken lock on Integer");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + " I will attempt to take String lock");
				synchronized (String.class) {
					System.out.println(Thread.currentThread().getName() + " Now I have taken a lock on String as well");
				}

			}

		};

		new Thread(r2).start();

	}

}
