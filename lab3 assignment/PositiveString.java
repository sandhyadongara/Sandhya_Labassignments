/*
 * Desc:check whether positive string
 * @Author:Sandhya
 */
package Lab3;

import java.util.*;

public class PositiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String r = sc.nextLine();

		String str = checkPositive(r);

	}

	public static String checkPositive(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i + 1) < str.charAt(i))// checking the index value
			{
				System.out.println("Negitive String");
			} else {
				System.out.println("Positive String");
			}
		}
		return str;
	}

}
