package Abstraction;

public abstract class Car {
	int price ;
	String brand;
	void setCarData(int price,String brand)
	{
		this.price=price;
		this.brand=brand;
	}

	void wheelno()
	{
		System.out.println("4 wheels");
		
	}
	void gairs()
	{
		System.out.println("5 gairs");
	}
	
	abstract void noOfSeats();
	abstract void dashBoard();
	
	abstract void engine();
	//abstract void wheeltype();
	
}
