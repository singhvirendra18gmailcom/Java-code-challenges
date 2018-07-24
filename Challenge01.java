package challenge01;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;


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
	
	  @Test
	    public void nullTest() {
	        Challenge01 tester = new Challenge01();
	        Set<Character> s=tester.getDuplicates(null);
	       assertEquals(0, s.size()); 
	    }
	    
	    @Test
	    public void emptyTest() {
	        Challenge01 tester = new Challenge01();
	        String str=new String("");
	        Set<Character> s=tester.getDuplicates(str);
	       assertEquals(0, s.size()); 
	    }
	    
	    @Test
	    public void aTest() {
	        Challenge01 tester = new Challenge01();
	        String str=new String("Java");
	        Set<Character> s=tester.getDuplicates(str);
	        assertTrue(s.contains('a')); 
	    }
	    
	    @Test
	    public void bTest() {
	        Challenge01 tester = new Challenge01();
	        String str=new String("Programming");
	        Set<Character> s=tester.getDuplicates(str);
	        assertTrue(s.contains('r'));
	        assertTrue(s.contains('g'));
	        assertTrue(s.contains('m'));
	        
	        
	    }
}
