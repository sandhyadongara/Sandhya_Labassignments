package Lab1;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of values");
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println("Value of n th term is" +c);
	}

}
