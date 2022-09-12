package Interface;

public interface Scooter {
	void wheel();
    void gairs();
    
}
interface Car{
	void windo();
	void sets();
}
class Vehical implements Scooter,Car
{
	public void wheel()
	{
		System.out.println("scooter wheels is 2 ");
	}
	public void gairs()
	{
		System.out.println("scooter gairs is 4");
	}
	public void windo()
	{
		System.out.println("car windo is 4");
	}
	public void  sets()
	{
		System.out.println("car seats is 5");
	}
	}
