package Array;

public class Employee2 {
	int id,salary;
    String name,dept,location;
Employee2(int id,String name,String dept,int salary,String location)
{
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.salary=salary;
	this.location=location;
}

public String toString()
{
	 return id+" "+name+" "+dept+" "+salary+" "+location;
			 
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
