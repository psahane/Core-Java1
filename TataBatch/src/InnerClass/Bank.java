package InnerClass;

public class Bank {
String name, ifscCode;

Bank(String n,String i)
{
	this.name=n;
	this.ifscCode=i;
	}
public void ShowDetail()
{
 System.out.println("bank name:"+name+"\nifscCode :"+ifscCode);	
}

class Loker
{
 int lId;
 String lLocation;
 Loker(int i,String l)
 {
	 this.lId=i;
	 this.lLocation=l;
 }
	 public void LokerInfo()
	 {
		 System.out.println("lId : "+lId+ "\nlLocation :"+lLocation);
	 }
 }
}


