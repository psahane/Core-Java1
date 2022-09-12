package Array;

import java.util.Scanner;

public class Employeegetset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Employee emp[]=new Employee [3];
		
		 for(int i=0;i<3;i++)
		   {   
			   
			   System.out.println("enter "+(i+1)+" student detail:");
				System.out.println("enter the id");
			     int id=sc.nextInt();
			     System.out.println("enter the name");
			     String name=sc.next();
			     System.out.println("enter the dept");
			     String dept=sc.next();
			     System.out.println("enter the salary");
			     int salary=sc.nextInt();
			     System.out.println("enter the location");
			     String location=sc.next();
			     
			     Employee e=new Employee();
			        e.setId(id);
					e.setName(name);
					e.setDept(dept);
					e.setSalary(salary);
					e.setLocatoin(location);
					emp[i]= e;
			     
		   }
		 for(Employee a:emp)
		 {
			 if(a.getDept().equals("HR") && a.getSalary()>30000)
			 {
				 System.out.println(a);
			 }
		 }
	}
}

