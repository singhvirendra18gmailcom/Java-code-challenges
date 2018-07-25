package challenge12;

import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

/**
 * reverse words in a sentence without using library method? (solution)
 * Write a function, which takes a String word and returns sentence on 
 * which words are reversed in order e.g. if an input is "Java is best 
 * programming language", the output should be "language programming best is Java".
 */
public class Challenge12 {

	public static String reverseWords(String input){
		StringBuffer toReturn=new StringBuffer();
		if(input==null || input.isEmpty()) {
			return toReturn.toString();
		}else {
			String[] words=input.split(" ");
			int wordCount=words.length;
			wordCount--;
			for(int i=0;i<=wordCount;i++) {
				toReturn.append(words[wordCount-i]+" ");
			}
		}
		return toReturn.toString().trim();
	}
	
	
	@Test
	public void test() {
		String returned=Challenge12.reverseWords("how hi hello");
		System.out.println(returned);
		assertTrue("hello hi how".equals(returned));
	}
	
}
