package challenge10;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * The Class Challenge10. in a String replace each given character to other e.g.
 * blank with %20? Write a Java program to replace a given character in a String
 * to other provided character, for example if you are asked to replace each
 * blank in a String with %20, similar to URL encoding done by the browser, so
 * that Server can read all request parameters. For example if the input is
 * "Java is Great" and asked to replace space with %20 then it should be
 * "Java%20is%20Great".
 */
public class Challenge10 {

	/**
	 * To number.
	 *
	 * @param input
	 *            the input
	 * @return the int
	 */
	public static String replace(String input, char old, String n) {
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException("No source string found");
		}

		while (input.indexOf(old) != -1) {
			int pos = input.indexOf(old);
			input = input.substring(0, pos) + n + input.substring(pos + 1);
		}

		return input;
	}

	/**
	 * Test.
	 */
	@Test
	public void test() {
		String s = Challenge10.replace("Hello How are you", ' ', "%20");
		System.out.println(s);
		assertTrue("Hello%20How%20are%20you".equals(s));

		try {
			Challenge10.replace(null, 'e', "mm");
			assertTrue(false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}

	}
}
