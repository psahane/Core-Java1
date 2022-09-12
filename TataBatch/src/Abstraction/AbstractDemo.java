package Abstraction;

//b. Can we declare a class abstract with no methods in it?

abstract public class AbstractDemo {
	
	 private int i = 0;
	 
	   public void display() { 
		   
	      System.out.print("Welcome to java ");
	   }
}
	     class ClassDemo extends AbstractDemo{
		   
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AbstractDemo a = new ClassDemo();
	      a.display();
	}

}
