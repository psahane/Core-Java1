package A;

public class Test1 {
	int a=10;
	private int b=20;
	protected int c=30;
	public int d=40;
	void display()
	{
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Test1 t1 =new Test1();
    System.out.println(t1.a);
    System.out.println(t1.b);
    System.out.println(t1.c);
    System.out.println(t1.d);
    t1.display();
    
	}

}
