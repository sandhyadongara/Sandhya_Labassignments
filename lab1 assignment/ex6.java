package Lab1;
import java.io.*;
import java.util.*;
public class ex6 {
	
	public static void main(String args[] ) {
		
			Scanner sc=new Scanner(System.in);
			ex6 s1=new ex6();
			int input=sc.nextInt();
			System.out.println(s1.calculateDifference(input));
			sc.close();
		}
		public int calculateDifference (int n)
		{
		    int sum=0,ps=0,res=0;
		    for(int i=0;i<=n;i++)
		    {
		        ps=ps+(i*i);
		        sum=sum+i;
		    }
		    int prod=sum*sum;
		    res=ps-prod;
		    return res;
		}
	}

