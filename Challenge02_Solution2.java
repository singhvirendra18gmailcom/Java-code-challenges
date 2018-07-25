package challenge02;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * The Class Challenge02.
 * 
 * check if two Strings are anagrams of each other? (solution) A simple coding
 * problem based upon String, but could also be asked with numbers. You need to
 * write a Java program to check if two given strings are anagrams of Each
 * other. Two strings are anagrams if they are written using the same exact
 * letters, ignoring space, punctuation and capitalization. Each letter should
 * have the same count in both strings. For example, Army and Mary are anagram
 * of each other.
 */
public class Challenge02_Solution2 {

	/**
	 * Checks if is anagram.
	 *
	 * @param s1
	 *            the s 1
	 * @param s2
	 *            the s 2
	 * @return the boolean
	 */
	public Boolean isAnagram(String s1, String s2) {
		Boolean toReturn = true;

		if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty() || s1.length() != s2.length()) {
			toReturn = false;
		} else {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);

			for (int i = 0; i < c1.length; i++) {
				if (c1[i] != c2[i]) {
					toReturn = false;
				}
			}
		}
		return toReturn;
	}

	
	@Test
	public void testSolution1() {
		Challenge02_Solution2 tester = new Challenge02_Solution2();
		assertTrue(!tester.isAnagram("Hary", null));
		assertTrue(!tester.isAnagram(null, null));
		assertTrue(!tester.isAnagram(null, "Harry"));
		assertTrue(!tester.isAnagram("", ""));
		assertTrue(tester.isAnagram("Army", "Mary"));
		assertTrue(tester.isAnagram("Programming", "aggPrrmmino"));
		assertTrue(tester.isAnagram("word pow;er", "dowr ;rewop"));
	}
	
	@Test
	public void testSolution2() {
		Challenge02_Solution2 tester = new Challenge02_Solution2();
		assertTrue(!tester.isAnagram("Hary", null));
		assertTrue(!tester.isAnagram(null, null));
		assertTrue(!tester.isAnagram(null, "Harry"));
		assertTrue(!tester.isAnagram("", ""));
		assertTrue(tester.isAnagram("Army", "Mary"));
		assertTrue(tester.isAnagram("Programming", "aggPrrmmino"));
		assertTrue(tester.isAnagram("word pow;er", "dowr ;rewop"));
	}
}