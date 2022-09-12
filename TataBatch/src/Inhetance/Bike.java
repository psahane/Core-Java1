package Inhetance;

public class Bike {

	
	int bid;
	String bname;
	
	Bike()
	{
		bid=101;
		bname="shine";
		
	}
	
	public void bike(int i,String n)
	{
		bid=i;
		bname=n;
		System.out.println("bike id is "+bid);
		System.out.println("bike name is "+bname);
		
}

	
}
