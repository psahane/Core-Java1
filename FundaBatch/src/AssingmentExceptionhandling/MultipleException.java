package AssingmentExceptionhandling;

import java.util.Scanner;

public class MultipleException {
	void mult(int a,int b)
	{
		System.out.println("multiplication is ="+(a*b));
	}
	void StringIndex(String s)
	{
		System.out.println(" String length "+s.length());
		
	}
	void sub(int a,int b)
	{
		System.out.println("Subtraction is ="+(a-b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the two no");
		int a=sc.nextInt();
		int b=sc.nextInt();
		MultipleException m=new MultipleException();
		try
		{
			try
			{
				try 
				{
					m.mult(a, b);
					
					
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					e.printStackTrace();
				}
				m.sub(a, b);
				
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			m.StringIndex(null);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
