package Containment;

public class Topic {
	int tid;
	String tname;
	SubTopic st;
	
public void setTid(int i)
{
	this.tid=i;
	
	}
public void setTname(String n)
{
	this.tname=n;
	
	}
public void setSubTopic(SubTopic s)
{
	this.st=s;
	
	}
public String toString()
{
	return "Topc\n"+tid+" "+tname+" "+st;
	}
}
