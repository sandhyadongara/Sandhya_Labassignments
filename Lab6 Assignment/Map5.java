
/**
 * Author:Sandhya
 * array of integer elements and return the second smallest element in the array
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Map5 {
	public static void main(String args[]) {
		/**
		 * insert element in an Array call the getSecondSmallestElement display second
		 * smallest element
		 */
		Map5 m = new Map5();
		int[] arr = { 12, 927, 2, 35, 799 };
		System.out.println(m.getSecondSamllest(arr));
	}

	public int getSecondSamllest(int[] arr) {
		/**
		 * insert array element in a list
		 */
		List<Integer> m = new ArrayList<Integer>();
		for (int x : arr) {
			m.add(x);
		}
		Collections.sort(m);// Sorting array

		return m.get(1);
	}

}
