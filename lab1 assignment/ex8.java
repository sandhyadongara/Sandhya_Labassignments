package Lab1;
import java.util.*;
public class ex8 {
	public static void main(String args[] )  {
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  ex8 obj=new ex8();
		  System.out.println(obj.checkNumber(n));
	}
	public boolean checkNumber(int n)
	{
		int k=1;
		while(k<=n)
		{
			int x=(int)Math.pow(2,k++);
			if(x==n)
			return true;
		}
		return false;
	}
}
