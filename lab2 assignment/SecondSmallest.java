/*
 * Desc : Finding Second Smallest number
 * @Author: Sandhya
 */
package Lab2;
import java.util.Arrays;
import java.util.Scanner;
public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[4];
		System.out.println("Enter array values");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		SecondSmallest obj=new SecondSmallest();
		int number=obj.getSecondSmallest(a,size);
		System.out.println(number);
	}
	int getSecondSmallest(int a[],int size)
	{
		Arrays.sort(a);//Sorting the array
		for(int i=0;i<size;i++)
		{
		for(int j=i+1;j<size;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;//Taking temp variable and swappig
			}
		}
		}
	return a[1];//refering second number with index
	}
}
		

