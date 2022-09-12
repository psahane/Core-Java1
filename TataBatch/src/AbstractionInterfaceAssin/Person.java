package AbstractionInterfaceAssin;

import java.util.Scanner;


interface TaxPayer 
{
	  abstract void  payTax();
}
public class Person {
	
	String name,address;
	int age ;
	
  void 	getDetail()
  {
	  Scanner sc=new Scanner (System.in);
	  System.out.println("enter name,address,age");
	  name=sc.nextLine();
	  address=sc.nextLine();
	  age=sc.nextInt();
	  
  }
  void showDetail()
  {
	  System.out.println("Person Detail");
	  System.out.println("person name"+name);
	  System.out.println("person address"+address);
	  System.out.println("person age "+age);
	  
	  
  }
}
 

  class Employee extends Person implements TaxPayer
  {
	  int empid;
	  double basic,da,hra;
	double grossSalary;
	  
	  Employee(int i,double b,double d,double h,double g)
	  {
		  empid=i;
		  basic=b;
		  da=d;
		   hra=h;
		   grossSalary=g;
		  
	  }
	  void empDatail()
	  
	  {
		  System.out.println(empid+" "+basic+" "+hra+" "+da+" "+grossSalary);
	  }
	  void CalculateSalary()
	  {
		  
		  Scanner obj1=new Scanner(System.in);
		  System.out.println("Enter Basic salary of the employee");
		  basic=obj1.nextDouble();
		  da=40*basic/100;
		  hra=20*basic/100;
		  grossSalary= basic+da+hra;
		  System.out.println("D.A of the basic salary of the employee is:" +da);
		  System.out.println(" H.R.A of the basic salary of the employee is:" +hra);
		  System.out.println(" Gross salary of the employee is:" +grossSalary);
		  
	  }
	
	public void payTax() 
	{
		System.out.println("your tax payble amount is"+(grossSalary*0.2));
		
	}
	  
  }
  class VP extends Employee
  {

	 
	VP(int i, double b, double h, double d, double g) 
	{		super(i, b, h, d, g);
	        super.CalculateSalary();
    }
 }
  
