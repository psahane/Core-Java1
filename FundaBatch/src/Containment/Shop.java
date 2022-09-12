package Containment;

public class Shop {

	int sid;
	String sname;
	Shop(int i,String n)
	{
		sid=i;
		sname=n;
	}
	public String toString()
	{
		return sid+""+sname;
	}
}
