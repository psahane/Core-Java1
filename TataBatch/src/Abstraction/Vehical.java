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
			System.out.println("Start With kik");
		}
	}
