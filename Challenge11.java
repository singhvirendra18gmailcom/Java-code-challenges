package challenge11;


import java.util.Set;

/**
 * find all permutations of a String
 */
public class Challenge11 {

	public static void main(String[] args) {
		permutations("123");
	}
	
	
	public static void permutations(String input) {
		permutations("", input);
	}
	/**
	 * To number.
	 *
	 * @param input
	 *            the input
	 * @return the int
	 */
	public static void permutations(String perm, String input) {
		if (input == null || input.isEmpty()) {
			System.err.println(perm + input);
		}

		for(int i=0;i<input.length();i++) {
			permutations(perm+ input.charAt(i), input.substring(0, i)+ input.substring(i+1, input.length()));
			
		}
	
	}

}
