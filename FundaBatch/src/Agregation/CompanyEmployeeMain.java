package Agregation;

import java.util.Arrays;
import java.util.Scanner;

public class CompanyEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Company com[]=new Company[1];
		
		for(int i=0;i<1;i++)
		{
			System.out.println("Enter  company name "+(i+1));
			String cnname=sc.next();
			int totalemp=sc.nextInt();
			
			Employee emp[]=new Employee[2];
        for(int j=0;j<2;j++)
    	 
			{
    	   System.out.println("enter id name dept salary contact address "+(j+1));
    	   int id=sc.nextInt();
    	   String name=sc.next();
    	   String dept=sc.next();
    	   int salary=sc.nextInt();
    		int contact=sc.nextInt();
    		String Address=sc.next();
    		Employee e=new Employee();
    		e.setId(id);
    		e.setName(name);
    		e.setDept(dept);
    		e.setSalary(salary);
    		e.setContact(contact);
    		e.setAddress(Address);
    		emp[j]=e;
    		
    		
    			   }
     Company c=new Company();
     c.setName(cnname);
     c.setTotalemp(totalemp);
     c.setEmp(null);
     com[i]=c;
     
	}
		System.out.println(Arrays.toString(com));
//for(Company c:com)
//{
//	for(Employee e:emp)
//	{
//		if(e.getAddress().equals("pune")&&e.getSalary()>30000);
//		{
//			System.out.println(c.name+""+e.id+""+e.dept+""+e.salary+""+e.contact+""+e.address);
//		}
//		
//	}
//		
//}
		
		for(Company c:com)
		{
			for(Array.Employee e:c.emp)
			{
				int a=0;
				if(e.getSalary()>50000)
				{
					a=e.getSalary()*15/100;
					System.out.println(c.name+"  old salary  "+e.getSalary()+"  new salary  "+(e.getSalary()+a));
				}
				
			}
		}
		sc.close();
}
}