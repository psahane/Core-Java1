package ContainmentInheritanceAssin;

public class Laptop {

	int cost;
	String brand;
	OperatingSystem o;
	Laptop(String b,int c,OperatingSystem os)
	{
		cost=c;
		brand=b;
		o=os;
	}
	public String toString()
	{
		return brand+"  "+cost+"  "+o;
	}	
}
