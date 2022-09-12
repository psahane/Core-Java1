package constructor;

import java.util.Scanner;

public class employee {
	int id,salary;
	String fistname ,lastname,dept,design;
	employee()
	{
		
	}
		void setId()
		{
			this.id=id;
			
		}
		int getId()
		{
			return id;
		}
		void setfistname(String firstname)
		{
		this.fistname=firstname;
		
		}
		String getfistname()
		{
			return fistname;
		}
		public String toString()
		{
			return id+""+fistname+""+lastname+""+salary+""+dept+""+design;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		  System.out.println("enter employee details:");
		  int id=sc.nextInt();
		  String firstname=sc.next();
		  String lastname=sc.next();
		  String dept=sc.next();
		  String design=sc.next();
		  
		employee e1=new employee();
		
		e1.setId();
		e1.setfistname(firstname);
		e1.setfistname(lastname);
		e1.setDept(dept);
		e1.setDept(design);
		e1.setSalary(id);
		System.out.println(e1);
	}
	private void setSalary(int id2) {
		// TODO Auto-generated method stub
		
	}
	private void setDept(String dept2) {
		// TODO Auto-generated method stub
		
	}
	}