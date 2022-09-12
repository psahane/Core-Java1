package ParmeterisedConsructor;

public class Student {
	
	
	int sId;
	String sname,department;
	
	Student(int i,String name,String department)
	{
		this.sId=i;
		this.sname=name;
		this.department=department;
		
	}
 void display()
 {
	 System.out.println(sId+" "+sname+" "+department);
	 
 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Student s=new Student(101,"pravin","computer" );
	Student s1=new Student (102,"sahane","civil");
	s.display();
	s1.display();
	
	}

}
