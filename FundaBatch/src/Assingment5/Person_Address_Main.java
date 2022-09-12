package Assingment5;

import java.util.Scanner;

public class Person_Address_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter city,state country");
		String city=sc.next();
		String state =sc.next();
		String country=sc.next();
		Address a=new Address();
		a.setCity(city );
		a.setState( state );
		a.setCountry( country);
		 
		
		System.out.println("enter name ,gender ,age,Address ");
		String name=sc.next();
		String gender=sc.next();
		String age=sc.next();
		String Address=sc.next();
		Person p=new Person();
		p.setName(name );
		p.setGender( gender );
		p.setAge( age );
	    p.setA( a);
	    
		
	   
		System.out.println( p);
	}

}
