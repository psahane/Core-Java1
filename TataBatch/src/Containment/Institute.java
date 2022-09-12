package Containment;

public class Institute {

	int id;
	String iname;
	Branch b;
	
	public void setId(int i)
	{
		this.id=i;
		
	}
	public void setiname(String n)
	{
		this.iname=n;
		
	}
	public void setB(Branch b)
	{
		this.b=b;
		
	}
	public String toString()
	{
		return "Branch\n"+id+" "+iname+" "+b;
		}
	
}

