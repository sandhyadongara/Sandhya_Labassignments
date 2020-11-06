
/**
 * Author:sandhya
 * an array of numbers and returns the numbers and their squares in Hashmap
 */
import java.util.HashMap;
import java.util.Map;

public class Map3 {
	public static void main(String args[]) {
		int[] arr = { 2, 3, 4, 5, 6 };
		Map3 m = new Map3();
		// System.out.println(m.getSquares(arr));
		/**
		 * creating a map variable and call the getSquares()n function and print the
		 * valuse with the key
		 */
		Map<Integer, Double> mapp = m.getSquares(arr);
		for (Map.Entry entry : mapp.entrySet()) {
			System.out.println(entry.getValue() + " " + entry.getKey());
		}
	}

	public Map<Integer, Double> getSquares(int[] arr)
	/**
	 * creating a map variable with the hashmap object
	 */
	{
		Map<Integer, Double> map = new HashMap<Integer, Double>();
		for (int x : arr) {
			/**
			 * square the number and put the value
			 */
			map.put(x, Math.pow(x, 2));
		}
		return map;
	}

}
