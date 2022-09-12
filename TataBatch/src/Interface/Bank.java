package Interface;

public class Bank {
	
	float iRate=7.2f;
	public int add(int x,int y) {
		
       System.out.println("Calculting machuared amount ");
		return ((x-y)*(int)iRate/100)+(x+y);
		
	}
	public void multi(int x,int y)
	{
		System.out.println("multiplication ");
	}
	

}
