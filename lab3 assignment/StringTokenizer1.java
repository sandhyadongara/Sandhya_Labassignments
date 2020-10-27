/*
 * Desc: Display each integer and sum of integer
 * @Author:Sandhya
 */
package Lab3;

import java.util.*;

public class StringTokenizer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integers");
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens())// Method to check the availability of token
		{
			String temp = st.nextToken();// Storing the Tokens in the temp variable
			n = Integer.parseInt(temp);// Coverting String to integer
			System.out.println(n);
			sum = sum + n;
		}
		System.out.println("Sum of the integers" + sum);
	}
}
