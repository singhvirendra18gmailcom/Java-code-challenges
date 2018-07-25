package challenge04;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * The Class Challenge04.
 * 
 * Reverse String in Java using Iteration and Recursion?
 */
public class Challenge04 {

	public static String reverseUsingIteration(String input) {
		int len = input.length();
		char[] c = new char[len];
		len--;
		for (int i = 0; i <= len; i++) {
			c[i] = input.charAt(len - i);
		}
		return new String(c);

	}

	public static String reverse(String input){
		
		if(input.length()<2){
				return input;
		}
		
		return reverse(input.substring(1)) + input.charAt(0);
}
	@Test
	public void test() {	
		assertTrue(Challenge04.reverse("Hello").equals("olleH"));
		assertTrue(Challenge04.reverseUsingIteration("Hi Hello How are you").equals("uoy era woH olleH iH"));
		
	}
}
