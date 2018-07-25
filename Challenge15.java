package challenge15;

import static org.junit.Assert.assertTrue;

import java.util.LinkedHashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * The Class Challenge14. remove duplicate characters from String? This is one
 * of the interesting String question, which also has lots of variants. You need
 * to remove duplicate characters from a given string keeping only the first
 * occurrences. For example, if the input is ‘bananas’ the output will be
 * ‘bans’. Pay attention to what output could be, because if you look closely
 * original order of characters are retained the in output
 * 
 */
public class Challenge15 {

	/**
	 * Removes the duplicates.
	 *
	 * @param input
	 *            the input
	 * @return the string
	 */
	public static String removeDuplicates(String input) {
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException("invalid input found");
		}
		Set<Character> unique = new LinkedHashSet<Character>();
		for (Character c : input.toCharArray()) {
			unique.add(c);
		}
		StringBuffer buffer = new StringBuffer();
		for (Character c : unique) {
			buffer.append(c);
		}
		return buffer.toString();
	}

	/**
	 * Test.
	 */
	@Test
	public void test() {
		String output = Challenge15.removeDuplicates("madam");
		System.out.println(output);
		assertTrue("mad".equals(output));
	}
}
