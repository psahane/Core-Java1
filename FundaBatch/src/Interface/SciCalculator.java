package Interface;

public class SciCalculator implements  Calculator{
	public void add()
	{
		int a=50,b=20;
		System.out.println("Addition="+(a+b));
	}
	public void sub()
	{
		int a=50,b=20;
		System.out.println("Subtraction="+(a-b));
	}
	public void mult()
	{
		int a=5,b=20;
		System.out.println("Multiplication="+(a*b));
	}

	public void div()
	{
		int a=50,b=4;
		System.out.println("Division="+(a/b));
	}
	public void power()
	{
		double power=Math.pow(5,3);
		System.out.println("Power="+power);
	}
	public void sqroot()
	{
		double sqrt=Math.sqrt(18);
		System.out.println("sqrt="+sqrt);
	}
}
