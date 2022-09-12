package Containment;

public class OutHous {

	int hid;
	String hname;
	/*
	OutHous(int i,String n)
	{
		hid=i;
		hname=n;
	
	}*/
	public void setHid(int i)
	{
		hid=i;
		
	}
	public void setHname(String n)
	{
		hname=n;
		
	}
	public String toString()
	{
		return hid+" "+hname;
		
	}
}
