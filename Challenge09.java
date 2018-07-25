package challenge09;

import java.util.regex.Pattern;
import org.junit.Test;

/**
 * The Class Challenge09. write a method like atoi() from C/C++, which takes a
 * numeric String and return its int equivalent. For example, if you pass
 * "67263" to the program then it should return 67263. Make sure your solution
 * is robust i.e. it should be able to handle + and - character, null and empty
 * String, integer overflow and other corner cases.
 */
public class Challenge09 {

	/**
	 * To number.
	 *
	 * @param input
	 *            the input
	 * @return the int
	 */
	public static double toNumber(String input) {
		double toReturn = 0;
		if (input == null || input.isEmpty()) {
			toReturn = 0;
		}
		for (int i = input.length() - 1, j = 0; j < input.length() && i >= 0; i--, j++) {
			String s = input.substring(i, i + 1);

			if (Pattern.matches("[0-9]{1}", s)) {
				toReturn += getNumber(s) * Math.pow(10, j);
			} else {
				throw new IllegalArgumentException("Non Number character found in input");
			}
		}

		return toReturn;
	}

	private static double getNumber(String i) {
		double num = 0;
		switch (i) {
		case "0":
			num = 0;
			break;
		case "1":
			num = 1;
			break;
		case "2":
			num = 2;
			break;
		case "3":
			num = 3;
			break;
		case "4":
			num = 4;
			break;
		case "5":
			num = 5;
			break;
		case "6":
			num = 6;
			break;
		case "7":
			num = 7;
			break;
		case "8":
			num = 8;
			break;
		case "9":
			num = 9;
			break;
		default:
			throw new IllegalArgumentException("Invalid character found" + i);
		}
		return num;
	}

	/**
	 * Test.
	 */
	@Test
	public void test() {
		System.out.println(Challenge09.toNumber("675"));

	}
}
