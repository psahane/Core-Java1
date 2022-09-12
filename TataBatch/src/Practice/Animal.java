package Practice;

public class Animal {
	void eat()
	{
		System.out.println("eating");
		
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
		
	}
	}
class Cat extends Animal
{
	void Meow()
	{
		System.out.println("meowing");
	}}
class TastInheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat c=new Cat();
c.eat();
c.Meow();
		
	}

}
