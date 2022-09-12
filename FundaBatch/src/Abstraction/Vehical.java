package Abstraction;

public abstract  class Vehical {
	int no_of_tyre;
	abstract void Start();
}
 class Car1 extends Vehical
{
	void Start()
	{
		System.out.println("Start with key");
	}
	}
	class Scooter extends Vehical
	{
		void Start()
		{
			System.out.println("Start eith kik");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehical v=new Vehical();
   
	}

	}
