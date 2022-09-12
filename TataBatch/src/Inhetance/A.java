package Inhetance;

public class A {
	int a;
	
	public A()
	{   
		System.out.println("");
		a=100;
		
	}
public A(int x)
{
 
}
}
class C extends A{
	int c;
	public C()
	{
		super(40);
		c=10;
		
	}
	
}
