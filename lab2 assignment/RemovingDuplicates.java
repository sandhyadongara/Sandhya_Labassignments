/*
 * Desc : remove duplicate values and sorting in descending
 * @Author: Sandhya
 */
package Lab2;
import java.util.*;
public class RemovingDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array");
		size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		int resultArray[] = modifyArray(array);
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i] + " ");
		}
	}

	private static int[] modifyArray(int[] array) {
		int length = array.length;
		// comparing each element
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] == array[j]) {
					array[j] = array[length - 1];
					length--;
					j--;
				}
			}
		}
		// new array to copy unique elements
		int array1[] = Arrays.copyOf(array, length);
		// sorting the array
		int temp;
		for (int i = 0; i < array1.length - 1; i++) {
			if (array1[i] < array[i + 1])
				;
			{
				temp = array1[i + 1];
				array1[i + 1] = array1[i + 1];
				array1[i] = temp;
			}
		}
		return array1;
	}
}
