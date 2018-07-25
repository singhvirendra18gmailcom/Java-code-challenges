package challenge13;

import static org.junit.Assert.assertTrue;
import java.util.Set;
import org.junit.jupiter.api.Test;

/**
 * *How to check if String is Palindrome ?(solution) For example, if the input is
 * "radar", the output should be true, if input is "madam" output will be true,
 * and if input is "Java" output should be false.
 */
public class Challenge13 {

	public static boolean isPalindrome(String input) {
		String revered = getReverse(input);
		System.out.println(revered);
		return input.equals(revered);
	}

	private static String getReverse(String input) {
		if (input.length() < 2)
			return input;

		return getReverse(input.substring(1)) + input.charAt(0);
	}

	@Test
	public void test() {
		boolean isPalindrome = Challenge13.isPalindrome("madam");
		assertTrue(isPalindrome);
	}
}
