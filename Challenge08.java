package challenge08;

import static org.junit.Assert.assertTrue;
import java.util.regex.Pattern;
import org.junit.Test;

/**
 * The Class Challenge08.
 * 
 * count occurrence of a given character in String?
 */
public class Challenge08 {

	/**
	 * Count.
	 *
	 * @param input the input
	 * @param c the c
	 * @return the int
	 */
	public static int count(String input, char c) {
		int count = 0;

		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Test.
	 */
	@Test
	public void test() {
		assertTrue(2 == (Challenge08.count("{Programming", 'm')));

	}
}
