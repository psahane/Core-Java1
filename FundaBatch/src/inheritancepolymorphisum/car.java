package inheritancepolymorphisum;

public class car {

	int id ;
	String name,brand;
	Driver d;
	car(int id,String name,String brand,Driver d)
	{
		this.id=id;
		this.name=name;
		this.brand=brand;
		this.d=d;
		
	}
  public String toString() 
	

  {
	return id+""+name+""+brand+""+d;  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
