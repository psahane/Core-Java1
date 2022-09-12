package Abstraction;

abstract public class Animal {
	 public abstract void sound();
	 public abstract void color();
	 
	}

    class Dog extends Animal{

		public void sound(){
			   
			System.out.println("Dog Sound  :bho bho ");
		   }
		public void color()
		{
			System.out.println("dog color : black ");
		}
	}
	 class Cat extends Animal
		{
		public void sound(){
			   
			System.out.println("Cat Sound  :mou mou ");
		   }
		public void color()
		{
			System.out.println("Cat color : white ");
		}
		}
	
		
	class	AnimalMain{	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Dog();
		a.sound();
		a.color();
		
		a=new Cat();
		a.sound();
		a.color();
		
		
	}

}
