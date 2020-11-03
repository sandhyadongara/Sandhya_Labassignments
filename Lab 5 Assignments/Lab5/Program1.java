/*
 * @Author:Sandhya
 * Description:Exception handling based on age condition
 */
package Lab5;

import java.util.Scanner;

public class Program1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");//user input
		int age = sc.nextInt();
		try {
			if (age <= 15)//checking age condition
				throw new InvalidAgeException("Invalid age");//throw the exception
			else
				System.out.println("your Age is:" + age);
		} catch (InvalidAgeException e) {//handling the exception
			System.out.println(e);
		}
	}
}
