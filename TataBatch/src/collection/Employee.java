package collection;

public class Employee {
	int cid;
	String cName;
	float cage;
	
	
	public Employee() {}
	public Employee(int i,String n,float a)
	{
		cid=i;
		cName=n;
		cage=a;
	}
	public String toString()
	{
		return cid+""+cName+""+cage;
		
	}

}
