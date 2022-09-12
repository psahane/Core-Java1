package Assingment3;

public class Employee1 {
	int id,Salary;  
	 String name;  
	 Employee1(int i, String n,int s)
	 {  
	  id = i;  
	  name = n;
	  Salary=s;
	 }  
	 Employee1(Employee1 e)
	 {  
	  id = e.id;  
	  name = e.name;
	  Salary=e.Salary;
	 }  
	 void display() {  
	  System.out.println(id + " " + name+" "+Salary);  
	 }  
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Employee1 emp = new Employee1(101, "pravin",20000);  
		  Employee1 emp1 = new Employee1(emp);
		  
		  
		  
		  emp.display();  
		  emp1.display();
	}

}
