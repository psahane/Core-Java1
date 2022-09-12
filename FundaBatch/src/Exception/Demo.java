package Exception;

import java.util.Scanner;

public class Demo {

	static void add(int a,int b)
	{
		System.out.println("addition is:"+(a+b));
	}
	static void div(int a,int b)
	{
		System.out.println("division is:"+(a/b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
           System.out.println("enter 2 no=");
          int a=sc.nextInt();
          int b=sc.nextInt();
          try
          {
          	
          add(a,b);
          }
          catch(ArithmeticException e)
          {
          	//System.out.println(e);
          	e.printStackTrace();
          	}
          div(a,b);

          	}

}
