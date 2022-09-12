package ParmeterisedConsructor;

public class Bike {
	
	int no;
	String name;
	 
	Bike(int i,String name)
	{
		this.no=i;
		this.name=name;
		
	}
	void display()
	{
		System.out.println(no+""+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Bike Detail");
    Bike b=new Bike(101,"scooter");
    Bike b1=new Bike(102,"slpender");
    
    		b.display();
    		b1.display();
    		
    		
		
		
	}

}
