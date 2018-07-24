package challenge01;

import java.util.LinkedHashSet;
import java.util.Set;


/**
 * The Class Challenge01.
 * 
 * print duplicate characters from a given String,
 * for example if String is "Java" then program should print "a". 
 * Bonus points if your program is robust and handle different kinds of input 
 * e.g. String without duplicate, null or empty String etc.
 *  Bonus points if you also write unit tests for normal and edge cases.
 */

public class Challenge01 {

	/**
	 * Gets the duplicates.
	 *
	 * @param string the string
	 * @return the duplicates
	 */
	public Set<Character> getDuplicates(String string) {
		Set<Character> toReturn = new LinkedHashSet<>();
		if (string == null || string.isEmpty()) {
			return toReturn;
		} else {
			for (int i = 0; i < string.length(); i++) {
				Character c = string.charAt(i);
				if (string.substring(i + 1, string.length()).contains(c.toString())) {
					toReturn.add(c);
				}
			}

			return toReturn;
		}

	}
}
