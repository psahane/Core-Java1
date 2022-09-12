package Abstraction;

public class Fortuner extends Car {

	void noOfSeats()

	{ 
		System.out.println("Innova has 7 seats");

	}
	void dashBoard()
	{
		System.out.println("music system,screen,meter");
	}
	void engine()
	{
		System.out.println("2800 cc");
	}
	public String toString()
	{
		return "Fortuner"+""+brand+""+price;	
	}
}
