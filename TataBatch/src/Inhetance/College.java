package Inhetance;

public class College {
int idcard;
String  cname;


void setCollegeData(int i,String n)
{
	idcard=i;
	cname=n;
}
void principle()
{
	System.out.println("principle is a mr.shelke");
}
void Stap()
{
	System.out.println("college stap  is a 40");
}

public String toString()
{
	return idcard+"  "+cname;
}
}