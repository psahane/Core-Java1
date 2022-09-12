package constructor;

public class Father extends GrandFather {
	String fatherfistname;
	void setFatherData(String fatherfistname)
	{
		this.fatherfistname=fatherfistname;
		
	}
	void display()
	{
		super.display();
		System.out.println("Father Name :"+fatherfistname+" "+super.fistname+" "+lastname);;
	}
}

