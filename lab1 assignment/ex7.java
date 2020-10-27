package Lab1;
import java.util.Scanner;
public class ex7 {
	public static void main(String args[] ) {
			Scanner sc=new Scanner(System.in);
			int num = sc.nextInt();
			ex7 src=new ex7();
			System.out.println(src.checkNumber(num));
			}
			public boolean checkNumber(int input)
			{
				int lastSeen=10;
				int current;
				while(input>0)
				{
					current=input%10;
					if(lastSeen<current)
					return false;
					lastSeen=current;
					input/=10;
				}
				return true;
			}
	}
