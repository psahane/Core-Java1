package ContainmentInheritanceAssin;

public class OperatingSystem {

	String osName,vendor;
	double version;
	
	OperatingSystem(String n,String v,double vr)
	{
		osName=n;
		vendor=v;
		version=vr;
		
		
	}
	public String toString()
	{
		return osName+" "+vendor+" "+version;
	}
	}
	
