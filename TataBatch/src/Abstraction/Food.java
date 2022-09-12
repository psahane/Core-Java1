package Abstraction;

abstract  class Food {
	
	abstract void  preparedFood();
	abstract void ingradiantFood();
	
	public  void parsalFood(String s) {
		System.out.println("parsalfood is"+s);
		}
	}
	
	class Dhosa extends Food
	{
		public void preparedFood()
		{
			System.out.println("prepare is Dhosa");
		}
		public void ingradiantFood() {
			System.out.println("integrating  Dhosa: cheez and all  ");
		}
		
	}
	class Pizza extends Food
	{
		
			public void preparedFood()
			{
				System.out.println("prepare is Pizza");
			}
			public void ingradiantFood() {
				System.out.println("integrating pizza :cheez and all  ");
			}
	}
	class Main{
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
  
			Food f=new Dhosa();
			  f.preparedFood();
			  f.ingradiantFood();
			  
			  Food f1=new Pizza();
			 f1.preparedFood();
			 f1.ingradiantFood();
	}
		
	}

