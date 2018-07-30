package ThreadlivelockExample;


/**
 * @author Virendra Singh
 * 
 * The Class Criminal.
 */
public class Criminal {

	/** The hostage relased. */
	private boolean hostageRelased;

	/**
	 * Sets the hostage relased.
	 *
	 * @param hostageRelased the new hostage relased
	 */
	public void setHostageRelased(boolean hostageRelased) {
		this.hostageRelased = hostageRelased;
	}

	/**
	 * Checks if is hostage relased.
	 *
	 * @return true, if is hostage relased
	 */
	public boolean isHostageRelased() {
		return this.hostageRelased;
	}

	/**
	 * Release hostage.
	 *
	 * @param police the police
	 * @throws InterruptedException the interrupted exception
	 */
	public void releaseHostage(Police police) throws InterruptedException {
		while (!police.isMoneySet()) {
			System.out.println(" Police has not given money yet.. We will ask again after 2 seconds");
			Thread.sleep(2000);
		}

		System.out.println(" Wow ..Police has given money , now we can relase hostages");
		this.hostageRelased = true;
		System.out.println(" Criminals have released hostages");

	}
}
