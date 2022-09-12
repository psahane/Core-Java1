package Abstraction;

abstract public class Student {
	int rollno;
	String name;
	abstract void  sudentId();
	abstract void  studentName();
	
	 class DepartmentCivil extends Student
	{
		
		public void sudentId()
		{
		  	System.out.println("civil Student Id: 101");
		}
		public void studentName()
		{
			System.out.println("civil Student  Name : Pravin ");
		}
		void Student(int r,String n)
		{
			rollno=r;
			name=n;
		}
	}
	class DepartmentCom extends Student
	{
		
		public void sudentId()
		{
		
		  	System.out.println(" Com Student Id: 102");
		}
		public void studentName()
		{
			System.out.println("Com Student  Name : Sahane");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
