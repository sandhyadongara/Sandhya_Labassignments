/*
 * Desc:Print mirror image of the string
 * @Author:Sandhya
 */
package Lab3;
import java.util.Scanner;
import java.util.*;

public class MirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String r = getImage(str);

	}

	public static String getImage(String r)

	{
		int k = r.length();// Storing the length of the string

		for (int i = 0; i < k; i++) {
			System.out.print(r.charAt(i));// Storing the charecter refernce with index number
		}
		System.out.print("||");

		for (int i = (k - 1); i >= 0; i--)// condition for reverse of the String
		{
			System.out.print(r.charAt(i));
		}

		return r;
	}

}
