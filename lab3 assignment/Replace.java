/*
 * Desc:Replacing consonant with next consonant
 * @Author:Sandhya
 */
package Lab3;

import java.util.*;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String r = alterString(str);
	}

	public static String alterString(String r) {
		int len = r.length();// calculating the string length
		for (int i = 0; i < len; i++)

		{
			char j = r.charAt(i);// storing the charecter with the reference of index varible

			if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u') {

				System.out.print(j);
			} else {
				char ch = r.charAt(i);
				ch++;
				System.out.print(ch);

			}
		}

		return r;
	}

}
