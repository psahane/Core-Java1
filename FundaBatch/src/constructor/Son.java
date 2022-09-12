package constructor;

public class Son extends Father {
	String sonfistname;
	void setSonData(String sonfirstname)
	{
		this.sonfistname=sonfistname;
		
	}
	void display()
	{
		super.display();
		System.out.println("Son Name :"+sonfistname+" "+super.fatherfistname+" "+lastname);;
	}
}

