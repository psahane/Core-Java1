package Array;

import java.util.Scanner;

public class Employeeconstructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee2 emp[]=new Employee2[3];
	Scanner sc=new Scanner(System.in);

	for(int i=0;i<3;i++)
	{
		System.out.println("enter "+(i+1)+" Employee detail:");
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
	     
	 
	    emp[i]=new Employee2(id,name,dept,salary,location);
	 
		}
	for(Employee2 a:emp)
	{
		 if(a.dept.equals("HR") && a.salary > 30000)
		 {
			 System.out.println( a );
			 
		 }
		
		}
	

		}


}
