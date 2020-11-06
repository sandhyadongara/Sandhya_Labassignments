
/**
 * 
 * @author Sandhya
 * accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Map7 {
	public static void main(String args[]) {
		Map7 m = new Map7();
		/**
		 * inserting element in list call the getSorted() function and displaying Sorted
		 * reverse array
		 */
		int[] arr = { 1, 100, 2, 5, 7, 2, 4, 6, 75, 67, 854 };
		// System.out.println(Arrays.toString(m.getSorted(arr)));
		int[] a = m.getSorted(arr);
		for (int x : a) {
			System.out.println(x);
		}

	}

	public int[] getSorted(int[] arr) {
		int a[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			String s = Integer.toString(arr[i]);
			StringBuilder sb = new StringBuilder(s);
			s = sb.reverse().toString();
			a[i] = Integer.parseInt(s);
		}
		/*
		 * placing the array values into list
		 */
		List<Integer> ls = new ArrayList<Integer>();
		for (int x : a) {
			ls.add(x);
		}
		Collections.sort(ls);// Sorting the arrray
		for (int i = 0; i < a.length; i++) {
			a[i] = ls.get(i);
		}
		return a;
	}

}