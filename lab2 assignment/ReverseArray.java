/*
 * Desc : Sort the elements in regular order by reversing
 * @Author: Sandhya
 */
package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		System.out.println("Enter array values:");// Taking the array values
		for (int i = 0; i < 4; i++) {
			a[i] = sc.nextInt();
		}
		ReverseArray obj = new ReverseArray();
		obj.sortStrings(a);
	}

	void sortStrings(int a[]) {
		String str = Arrays.toString(a);
		Arrays.sort(a);// Sorting the array
		System.out.println("sorted array is:" + Arrays.toString(a));// Printing the sorted array

	}
}