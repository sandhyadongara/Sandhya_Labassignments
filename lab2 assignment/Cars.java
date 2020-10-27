/*
 * Desc : Arranging cars
 * @Author: Sandhya
 */
package Lab2;

import java.util.*;
import java.io.*;

class CarOwner {
	private String name;
	private String regNo;

	public CarOwner(String name, String regNo) {
		this.name = name;
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

}

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("1.Park Car\n2.Get Car\n3.Get Available Space");
		System.out.println("Enter your choice");
		int choice = s.nextInt();
		String arr[][] = new String[5][];
		arr[0] = new String[100];
		arr[1] = new String[70];
		arr[2] = new String[50];
		arr[3] = new String[20];
		arr[4] = new String[10];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "null";
			}
		}
		switch (choice) {
		case 1:
			System.out.println("Enter the name and RegNo");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			String regNo = sc.nextLine();
			CarOwner c = new CarOwner(name, regNo);
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j].equals("null")) {
						c.setRegNo(regNo);
						arr[i][j] = c.getRegNo();
						break;
					}
				}
			}
			break;
		case 2:
			System.out.println("Enter the name and RegNo");
			Scanner sb = new Scanner(System.in);
			String Name = sb.nextLine();
			String RegNo = sb.nextLine();
			CarOwner car = new CarOwner(Name, RegNo);
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j].equals(RegNo)) {
						arr[i][j] = "null";
						break;
					}
				}
			}
			break;
		case 3:
			int count = 0;
			System.out.println("Available Space in Car is:");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j].equals("null")) {
						count++;
					}
				}

			}
			System.out.println(count);
			break;

		}

	}

}