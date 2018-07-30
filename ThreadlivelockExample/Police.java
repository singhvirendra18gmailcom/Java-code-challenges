package ThreadlivelockExample;


/**
 * @author Virendra Singh
 * 
 * The Class Police.
 */
public class Police {

	/** The money sent. */
	private boolean moneySent = false;

	/**
	 * Give ransom.
	 *
	 * @param crimnal the crimnal
	 * @throws InterruptedException the interrupted exception
	 */
	public void giveRansom(Criminal crimnal) throws InterruptedException {
		while (!crimnal.isHostageRelased()) {
			System.out.println("Criminals have not released hostage yet, We can not give money yet, "
					+ "we will check after 2 seconds if criminals have  released  hostages");
			Thread.sleep(2000);
		}

		System.out.println(" ok wow!! Criminals have not released hostage, We can give money now");
		this.moneySent = true;
		System.out.println(" We have given money now");

	}

	/**
	 * Sets the money sent.
	 *
	 * @param moneySent the new money sent
	 */
	public void setMoneySent(boolean moneySent) {
		this.moneySent = moneySent;
	}

	/**
	 * Checks if is money set.
	 *
	 * @return true, if is money set
	 */
	public boolean isMoneySet() {
		return this.moneySent;
	}
}
