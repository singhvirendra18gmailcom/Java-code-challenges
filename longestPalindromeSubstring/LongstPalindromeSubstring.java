package longestPalindromeSubstring;

import org.junit.jupiter.api.Test;

public class LongstPalindromeSubstring {

	public String getLongestPalindromeSubstring(String input) {
		String toReturn = "";
		int len = input.length();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j <= i; j++) {
				if (j + i < len - 1) {
					String temp = input.substring(j, j + i);
					if (isPalindrome(temp)) {
						if (temp.length() > toReturn.length()) {
							toReturn = temp;
						}
					}
				}
			}
		}
		return toReturn;

	}

	public static Boolean isPalindrome(String str) {
		StringBuilder builder = new StringBuilder(str);
		// System.out.println(builder);
		StringBuilder srev = builder.reverse();
		// System.out.println(srev);
		return str.equals(srev.toString());
	}

	public static void main(String args[]) {
		LongstPalindromeSubstring o = new LongstPalindromeSubstring();
		System.out.println(o.getLongestPalindromeSubstring("axbababa"));
	}
}
