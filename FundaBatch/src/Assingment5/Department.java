package Assingment5;

public class Department {
	int id;
	String name;
	Strudent s;

	Department(int id,String name,Strudent s)
	{
		this.id=id;
		this.name=name;
		this.s=s;
	}
	public String toString()
	{
		return id+" "+name+" "+s;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		

	}

}
