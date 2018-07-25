package challenge07;

import static org.junit.Assert.assertTrue;
import java.util.regex.Pattern;
import org.junit.Test;

/**
 * The Class Challenge06.
 * 
 * count number of vowels and consonants in a String.
 */
public class Challenge07 {

	public static String vowelAndConstantCount(String input) {
		int vowels = 0;
		int constants = 0;

		for (int i = 0; i < input.length() - 1; i++) {
			if (Pattern.matches("[a-zA-Z]{1}", input.substring(i, i + 1))) {
				if (Pattern.matches("[a,e,i,o,u]{1}", input.substring(i, i + 1))) {
					vowels++;
				} else {
					constants++;
				}

			}
		}
		return vowels + ";" + constants;
	}

	@Test
	public void test() {
		assertTrue("3;7".equals(Challenge07.vowelAndConstantCount("{Programming")));
	}
}
