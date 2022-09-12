package Containment;

public class SubTopic {
	
	int stid;
	String  stname;
	
	Question qst;
	
	public void setStId(int i)
	{
		stid=i;
		
	}
	public void setStName(String n)
	
	{
		stname=n;
		
	}
	
public void setQst(Question q)
	
	{
		qst=q;
		
	}
public String toString()
{
	return "SubTopic\n"+stid+" "+stname+" "+qst; 
		
}


}

