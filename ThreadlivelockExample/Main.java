package ThreadlivelockExample;


/**
 * @author Virendra Singh
 * 
 * The Class Main.
 */
public class Main {

	/** The police. */
	static Police police = new Police();
	
	/** The criminal. */
	static Criminal criminal = new Criminal();

	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		new Thread(()->{
			try {
				police.giveRansom(criminal);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		
		new Thread(()->{
			try {
				criminal.releaseHostage(police);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
		
		
	}
}
