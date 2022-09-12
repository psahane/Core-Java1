package Containment;

public class Branch {
	int bid;
	String bname;
	Subject s;

	public void setBid(int i)
	{
		this.bid=i;
		
	}
	public void setBname(String n)
	{
		this.bname=n;
		
	}
	public void setS(Subject s)
	{
		this.s=s;
		
	}
	public String toString()
	{
		return "Branch\n"+bid+" "+bname+" "+s;
		}
}
