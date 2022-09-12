package collection;

import java.util.ArrayList;
import java.util.Iterator;



public class EmployeeMain {
	
	ArrayList<Employee> l;
	public void EmployeeObject()
	{
		
	l=new ArrayList<Employee> ();
	System.out.println(l);
	}
	public void EmployeeInfo()
	{
		l.add(new Employee(1,"pravin",23));
		l.add(new Employee(2,"sahane",21));
		l.add(new Employee(3,"sagar",25));
		l.add(new Employee(4,"sarthak",24));
		
	}
		public void showEmployeeInfo()
		{
			System.out.println("using for each loop");
			for(Employee e: l)
				
			{
				System.out.println(l);
				if(e.cage>22)
					System.out.println(l);
				
			}
			System.out.println("using iterator");
			Iterator<Employee> e1=l.iterator();
			while(e1.hasNext())
			{
				Employee o=e1.next();
				System.out.println(o);
			}
			
			}
		
			
			
		
			
		
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
      ArrayList<Employee> l;
      l=new ArrayList<Employee>();
      Employee e=new Employee(1,"pravin",21);
      l.add(e);
      l.add(new Employee(2,"sahne",23));
      
      Iterator<Employee> i=l.iterator();
      
      while(i.hasNext())
      {
    	  Employee a=i.next();
    	  System.out.println(a);
      }
	}
	*/
		EmployeeMain obj=new EmployeeMain();
		obj.EmployeeInfo();
		obj.showEmployeeInfo();

}
}