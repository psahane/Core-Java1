package Inheritance;

public class Bike {

	int price ;
	String color,milage,brand;
	
	void setBikeData(int price,String color,String millage,String brand)
	{
		this.price=price;
		this.color=color;
		this.milage=milage;
		this.brand=brand;
		
		
	}
	public String toString()
	{
		return price+""+milage+""+price+""+color;
	}
	
	void wheelno()
	{
		System.out.println("2 wheels");
	}

	void seats()
	{
		System.out.println("2 seat");
	}
	void gears()
	{
		System.out.println("2 gears");
	}
	
}


