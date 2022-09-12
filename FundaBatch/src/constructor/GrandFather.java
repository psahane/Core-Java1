package constructor;

public class GrandFather {
	String fistname,middlename, lastname;
	void setGrandFatherData(String firstname,String middlename,String lastname)
	{
		this.fistname=fistname;
		this.middlename=middlename;
		this.lastname=lastname;
	}
	void display()
	{
		System.out.println("Grand Father:"+fistname+" " +middlename+" "+lastname);
	}
}


