/*
 * @Author:Sandhya
 * Description:Exception handling based on Employee salary
 */
package com.cg.eis.exception;
import java.util.Scanner;
public class EmployeeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int salary=sc.nextInt();//Taking user input
      try
      {
    	  if(salary<3000) //Checking the salary condition
    	  {
    		  throw new MyException("salary must be greater then 3000");
      }
      }
      catch(MyException e)//handling the exception
      {
    	  System.out.println(e);//Printing the Exception
      }
      
	}
	}
	class MyException extends Exception
	{
		public MyException()
		{
			super();//acquring the methods of parent class
		}
		public MyException(String msg) {
			super(msg);
		}
	}		


