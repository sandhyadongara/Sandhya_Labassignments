package Lab1;
import java.util.*;
public class ex5 {
	

		public static void main (String[] args) {
		  /* code */
		  Scanner sc=new Scanner(System.in);
		  int p=sc.nextInt();
		  ex5 obj=new ex5();
		  System.out.println(obj.calculateSum(p));
		}
		public int calculateSum(int n)
		{
		    int result=0;
		    for(int i=0;i<=n;i++)
		    {
		        if((i%3==0)||(i%5==0))
		        result=result+i;
		    }
		    return result;
		}
	}
