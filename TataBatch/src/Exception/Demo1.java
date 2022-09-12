package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	static void add(int a,int b)
	{
		System.out.println("addition is:"+(a+b));
	}
	static void index(int arr[],int i)
	{
		System.out.println(arr[i]);
	}
	static void div(int a,int b)
	{
		System.out.println("division is:"+(a/b));
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50};
		System.out.println("enter 2 no=");
		int a=0;
		int b=0;
		try 
		{
			
		 a=sc.nextInt();
		 b=sc.nextInt();
		  div(a,b);
		index(arr,3);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException|InputMismatchException e)
		{
			//System.out.println(e);
			e.printStackTrace();
			}
		add(a,b);
		}
	

		

	}


