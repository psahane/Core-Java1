package classandobject;

import java.io.InputStream;
import java.util.Scanner;

public class car {
	void enjinecapacity()
	{
		System.out.println("1100 cc");
	}
	void dashboard()
	{
		System.out.println("compalsary for each car");
		
	}
	void milage()
	{
		System.out.println("20km/1lt");
		
	}
	void wheelno()
	{
		System.out.println("4 wheels");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Scanner sc=new Scanner(System.in);
        
		car c1=new car();
        System.out.println("first car");
        c1.enjinecapacity();
        
        car c2=new car();
        System.out.println("second car");
        c2.enjinecapacity();
        c2.milage();
        c2.dashboard();
        
        car c3=new car();
        System.out.println("third car");
        c3.enjinecapacity();
	}
	private static void Scanner(InputStream in) {
		// TODO Auto-generated method stub
		
	}

}
