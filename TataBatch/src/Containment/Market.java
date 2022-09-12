package Containment;

public class Market {
	int marea;
	String mname;
	Shop s;
	/*
	Market(int a,String n,Shop p)
	{
		marea=a;
		mname=n;
		s=p;
		
	}*/
	
	
	public void setMarea(int a)
	{
		marea=a;
	}
	public void setMname(String n)
	{
		mname=n;
	}
	public void setS(Shop p)
	{
		s=p;
	}
	
	public String toString()
	{
		return marea+""+mname+""+s;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	}

}
