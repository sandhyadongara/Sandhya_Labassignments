/*
 * Desc:calculate difference
 * @Author:Sandhya
 */
package Lab3;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int r = modifyNumber(num);

	}

	public static int modifyNumber(int r) {
		int sum = 0;
		int h = r % 10;
		while (r != 0) {
			int a = r % 10;
			sum = sum * 10 + a;
			r = r / 10;

		}
		System.out.println(sum);// Reverse of the number

		while (sum != 0) {
			int k = sum % 10;
			sum = sum / 10;
			int l = sum % 10;

			int result = k - l;
			System.out.print(result);
		}
		return r;

	}

}
