
/**
 * Author:sandhya
 * character array and count the number of times each character is present in the array.
 */
import java.util.*;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	public static void main(String args[]) {
		/**
		 * all character insert in character array call the countChars function and
		 * print the value
		 */
		Map2 m = new Map2();
		char[] arr = { 'a', 'b', 'c', 'a', 'z', 'c' };
		// System.out.println(m.countChars(arr));

		Map<Character, Integer> map = m.countChars(arr);
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public Map<Character, Integer> countChars(char[] arr) {
		/**
		 * creating a hashmap object
		 */
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		/**
		 * check the character one by one is same or not if same then add +1 if not then
		 * add 1
		 */
		for (char c : arr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		return map;

	}
}
