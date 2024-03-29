package program;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Java Program to find duplicate Characters in a String
public class FindDuplicateCharInString {

	public static void main(String[] args) {
		System.out.println("Khandelwal");
		System.out.println("-------------------------");
		countDupChars("Khandelwal");

//		System.out.println("\nString: ChaitanyaSingh");
//		System.out.println("-------------------------");
//		countDupChars("ChaitanyaSingh");
//
//		System.out.println("\nString: #@$@!#$%!!%@");
//		System.out.println("-------------------------");
//		countDupChars("#@$@!#$%!!%@");
	}

	public static void countDupChars(String str) {

		// Create a HashMap
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		// Convert the String to char array
		char[] chars = str.toCharArray();

		/*
		 * logic: char are inserted as keys and their count as values. If map contains
		 * the char already then increase the value by 1
		 */
		for (Character ch : chars) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println("map: " + map);
		// Obtaining set of keys
//		Set<Character> keys = map.keySet();

		/*
		 * Display count of chars if it is greater than 1. All duplicate chars would be
		 * having value greater than 1.
		 */
//		for (Character ch : keys) {
//			// if (map.get(ch) > 1) {
//			System.out.println("Char " + ch + " " + map.get(ch));
//			// }
//		}
	}

}
