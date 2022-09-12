package classandobject;

import java.util.Scanner;

public class areaofcircle {
	
	int rsquare(int r) 

	
	{
     return r*r;
		
	}
	void area(int sqr)
	{
		double area=3.14*sqr;
	System.out.println("area of circle");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the radius of circle ");
    int r=sc.nextInt();
    areaofcircle c=new areaofcircle();
    c.area(r);
    sc.close();
    areaofcircle c1=new areaofcircle();
    System.out.println("enter the radius of circle ");
    r=sc.nextInt();
	}

}
