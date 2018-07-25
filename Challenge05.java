package challenge05;

import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

/**
 * The Class Challenge05.
 * 
 * 5) How to check if a String contains only digits? (solution) You need to
 * write a program to check a String contains only numbers by using Regular
 * expression in Java. You can use Java API but a solution without using Java
 * API will be better
 */
public class Challenge05 {

	public static boolean isDigitsOnly(String input) {
			return Pattern.matches("[0-9]*",input);		
	}
	
	@Test
	public void test() {
		
		assertTrue(!Challenge05.isDigitsOnly("olleH"));
		assertTrue(Challenge05.isDigitsOnly("986"));
		
	}
}
