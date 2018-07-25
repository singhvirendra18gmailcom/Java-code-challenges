package challenge03;

import static org.junit.Assert.assertTrue;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

/**
 * The Class Challenge03.
 * 
 * Given a string, your code must find out the first repeated as well as
 * non-repeated character in that string. For example, if “JavaConceptOfTheJay”
 * is the given string, then ‘v’ is a first non-repeated character and ‘a’ is a
 * first repeated character.
 */
public class Challenge03 {

	public Character[] findNonRepatedAndRepeatedChar(String input) {
		Character[] toReturn = new Character[2];
		if (input == null || input.isEmpty()) {
			return toReturn;
		} else {
			Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
			for (int i = 0; i < input.length(); i++) {
				Integer oldValue = map.put(input.charAt(i), 0);
				if (null != oldValue) {
					map.put(input.charAt(i), oldValue + 1);
				}
			}
			boolean nonRepeatedFound = false;
			boolean repeatedFound = false;
			for (Character c : map.keySet()) {
				if (map.get(c) == 0 && !nonRepeatedFound) {
					toReturn[0] = c;
					nonRepeatedFound = true;
				}
				if (map.get(c) > 0 && !repeatedFound) {
					toReturn[1] = c;
					repeatedFound = true;
				}
			}
		}

		return toReturn;

	}
	
	@Test
	public void test() {
		Challenge03 tester = new Challenge03();
		Character[] cs= tester.findNonRepatedAndRepeatedChar("avaConceptOftheDay");
		System.out.println(cs[0] +"  , " +cs[1]);
		assertTrue(cs[0].equals('v'));
		assertTrue(cs[1].equals('a'));
		
		
	}
}
