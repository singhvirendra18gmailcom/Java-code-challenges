package challenge16;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Stack;

import org.junit.jupiter.api.Test;

/**
 * validate xml tags
 * 
 */
public class Challenge16 {

	public static Boolean validateXml(String input) {
		Boolean toReturn = true;
		Stack<String> st = new Stack<>();
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException("invalid input found");
		}
		char ch = input.charAt(0);
		char chLast = input.charAt(input.length() - 1);
		if (ch != '<' || chLast != '>') {
			toReturn = false;
			return toReturn;
		}
		while (true) {
			int indexOfLess = input.indexOf('<');
			int indexofClosing = input.indexOf('/');
			int indexOfGreaterSymbol = input.indexOf('>');

			if (indexOfLess != -1 && indexOfGreaterSymbol != -1 && indexofClosing != indexOfLess + 1) {
				String toPush = input.substring(indexOfLess + 1, indexOfGreaterSymbol);
				st.push(toPush);

			} else {
				indexOfLess = input.indexOf("</");
				indexOfGreaterSymbol = input.indexOf(">");
				String toPop = input.substring(indexOfLess + 2, indexOfGreaterSymbol);
				if (!(st.pop().equals(toPop))) {
					toReturn = false;
					break;
				}
			}
			input = input.substring(indexOfGreaterSymbol + 1);
			if (input.length() <= 0)
				break;
		}
		return toReturn;
	}

	/**
	 * Test.
	 */
	@Test
	public void test() {
		String str = "<a></a><b><c></c></b>";
		Boolean output = Challenge16.validateXml(str);
		assertTrue(output);
		
		assertFalse(Challenge16.validateXml("dsad"));
		

	}
}
