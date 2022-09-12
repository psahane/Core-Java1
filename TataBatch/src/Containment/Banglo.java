package Containment;

public class Banglo {
	
	String owner;
	int area;
	OutHous t;
	/*
	Banglo(String o,int a,OutHous h)	
	{
		owner=o;
		area=a;
		t=h;
	}*/
  
   
	public void setOwner(String o)
	{
		owner=o;
	}
	public void setArea(int a)
	{
		area=a;
	}
	public void setT(OutHous s)
	
	{
		t=s;
	}
	 public String toString()
	 {
	 	return owner+" "+area+" "+t;
	 			}
}
