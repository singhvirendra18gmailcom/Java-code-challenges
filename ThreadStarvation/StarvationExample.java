package ThreadStarvation;

public class StarvationExample {

	public static void main(String[] args) {
		Task task=new Task();
		for(int i=0;i<10;i++) {
			new Thread(task).start();
		}
	}
	
}

class Task implements Runnable{

	@Override
	public synchronized void run() {
		 {
		System.out.println(Thread.currentThread().getName() + " going to read a file");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "Reading of a file is completed");
		
		while(true) {
			System.out.println(Thread.currentThread().getName() + "processing file..");
		}
	}
	
	}
}