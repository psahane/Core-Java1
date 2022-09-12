package AssingmentExceptionhandling;

import java.util.Scanner;

//3.	WAP to return int value in try block and return int value in finally block and observe which return takes precedence
public class CatchException {
	int  add(int a, int b)
	{
	 System.out.println("addition is ="+(a+b));
	 return (a+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	System.out.println("enetr the two no");
	int a=sc.nextInt();
	int b=sc.nextInt();
	CatchException c=new CatchException();
	try
	{
		c.add(a, b);
		
	}
	finally 
	{
		c.add(a, b);
		
	}
	System.out.println("Done");
	}

}
