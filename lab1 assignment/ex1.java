package Lab1;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ex1 obj=new ex1();
		System.out.println(obj.SumOfCubes(n));
	}
	public int SumOfCubes(int num)
	{
		int sum1=0;
		while(num!=0)
		{
			int digit=num%10;
			sum1=sum1+digit*digit*digit; 
			num=num/10;
			
		}
		return sum1;
	}

}
