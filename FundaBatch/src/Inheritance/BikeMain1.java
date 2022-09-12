package Inheritance;

import java.util.Scanner;

public class BikeMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the bike detail ");
  
  int price=sc.nextInt();
  String color=sc.next();
  String brand=sc.next();
  String milage=sc.next();
  Bike1 b=new Bike1();
  b.setColor(color);
  b.setBrand(brand);
  b.setMilage(milage);
  b.setPrice(price);
  
  Pulsor1 p=new Pulsor1();
		  
	}

}
