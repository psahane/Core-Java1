package Practice;

import java.util.Scanner;



public class CarCompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter car id,name,model,price");
		int id=sc.nextInt();
		String name=sc.next();
		String model=sc.next();
		int price=sc.nextInt();
		Car c=new Car();
		
		c.setId(id );
		c.setName( name);
		c.setModel( model);
		c.setPrice(price);
		
		
		System.out.println("enter company id,name,year");
		int cid=sc.nextInt();
		String cname=sc.next();
		int year=sc.nextInt();
		
		Company b1=new Company();
	    b1.setId(cid);
		b1.setName(cname);
		b1.setYear(year);
		b1.setC(c);
      System.out.println(b1);
      
      Company b2=new Company();
	    b2.setId(cid);
		b2.setName(cname);
		b2.setYear(year);
		b2.setC(c);
    System.out.println(b2);
		
		
		
		
		
	}

}
