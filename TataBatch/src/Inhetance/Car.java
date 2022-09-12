package Inhetance;

public class Car extends Bike{
	
	int cno;
	String cname;
	
	Car()
	{   
		cno=1234;
		cname="Swift";
		
	}
	
void car(int i,String n)
{
	cno=i;
	cname=n;
	System.out.println("car no is "+cno);
	System.out.println("car name is "+cname);
	
}

}

