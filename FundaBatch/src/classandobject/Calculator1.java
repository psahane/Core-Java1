package classandobject;

import java.util.Scanner;

public class Calculator1 {
	
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("addition is ="+c);
	}
	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println("susbtraction is="+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
 System.out.println("enter tow no ");
  int a=sc.nextInt();
  int b=sc.nextInt();
 
  Calculator1 s=new Calculator1();
  s.add(a,b);
  s.sub(a, b);
 
	
	
	}

}
