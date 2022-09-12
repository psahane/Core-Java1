package constructor;

import java.util.Scanner;

public class MainFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    Son s=new Son();
    System.out.println("enter grandfatherfirst name,middle,last");
   String fistname=sc.next();
   String middlename=sc.next();
   String lastname=sc.next();
   s.setGrandFatherData(fistname, middlename,lastname);
   System.out.println("enter father name");
   String fatherfistname=sc.next();
   s.setFatherData(fatherfistname);
   System.out.println("enter son name " );
   String  sonfistname=sc.next();
   s.setSonData(sonfistname);
   s.display();
	}

}
