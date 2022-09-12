package Inhetance;

public class Department extends College {
	
	int did;
	String dname;
	
void DepartmentData(int i,String n)
{
  did=i;
  dname=n;
  
}
 void civil()
{
	System.out.println("civil Department");
	
}
 void computer()
 {
	 System.out.println(" Computer Department");
	 
 }
 public String toString()
 
 {
	 return did+" "+dname;
 }
 
}