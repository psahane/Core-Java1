package Containment;

public class Market {
	
   int mid;
	String mname;
	Shop s;
	Market(int i,String n,Shop p)
	{
		mid=i;
		mname=n;
		s=p;
	}
	public String toString()
	{
		return mid+""+mname+""+s;
	}
	
}
