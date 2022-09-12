package ClassAndObject;

public class calculator {
	void add()
	{  
		int a=10,b=20;
		System.out.println("addition is:"+(a+b));
	}
	void sub()
	{
		int a=10,b=20;
		System.out.println("sub is:"+(a-b));
	}
	void mult()
	{
		int a=10,b=20;
		System.out.println("mult is:"+(a*b));
	}
	
	void div()
	{
		int a=10,b=20;
		System.out.println("div is:"+(a/b));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      calculator c1=new calculator();
      calculator c2=new calculator();
      calculator c3=new calculator();
      calculator c4=new calculator();
      
      
      c1.add();
      c2.sub();
      c3.mult();
      c4.div();
	}
	

}
