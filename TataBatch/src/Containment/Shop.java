package Containment;

public class Shop {
	
	int  sno;
	String sname,stype;
	/*
	Shop(int b,String n,String t)
	
	{
		sno=b;
		sname=n;
		stype=t;
	}*/
	
	public void setSno(int i)
	{
		sno=i;
		
	}
	public void setSname(String n)
	{
		sname=n;
	}
	
	public void setStype(String t)
	{
		stype=t;
		
	}
	public String toString()
	{
		return sno+""+sname+""+stype;
	}
	


}
