package Abstraction;

abstract  public class Diagram {

	double dim1;
	   double dim2;
	   Diagram(double a, double b) {
	      dim1 = a;
	      dim2 = b;
	   }
	      
	 abstract double area();
	}
	class Rectangle extends Diagram {
		
	   Rectangle(double a, double b) {
	      super(a, b);
	   }
	   
	   double area() {
	      System.out.println(" Area for Rectangle.");
	      return dim1 * dim2;
	   }
	}
	
	class Triangle extends Diagram {
		
	   Triangle(double a, double b) {
	      super(a, b);
	   }
	   
	   double area() {
		   
	      System.out.println(" Area for Triangle.");
	      return dim1 * dim2 / 2;
	   }
	}
	 

