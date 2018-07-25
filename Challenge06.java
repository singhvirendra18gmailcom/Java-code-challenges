package challenge06;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

/**
 * The Class Challenge06.
 * 
 *   find duplicate characters in a String.
 *   You need to write a program to print all duplicate character 
 *   and their count in Java. For example if given String
 *   is "Programming" then your program should print
 *   g : 2
 *   r : 2
 *   m : 2
 */
public class Challenge06 {

	public static void printduplcatesWithCount(String input) {
		Map<Character, Integer> counter=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<input.length()-1;i++) {
			Integer oldvalue=counter.put(input.charAt(i), 1);
			if(oldvalue!=null) {
				counter.put(input.charAt(i), oldvalue+1);
			}
		}
		
		counter.forEach((k,v)-> System.out.println(k +" :" + v));
		
			
	}
	
	@Test
	public void test() {
		Challenge06.printduplcatesWithCount("{Programming");
	}
}
