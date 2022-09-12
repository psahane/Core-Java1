package Interface;

public class Magzine extends Book implements Edit
{
	Magzine(int i,int c,String a,String b)
	{
		super(i,c,a,b);
	}
	public void read()
	{
		System.out.println("read mazine");
	}
	public void update()
	{
		System.out.println("update mazine");
	}
	public void write()
	{
		System.out.println("write mazine");
	}
	
	class NewsPaper implements Edit
	{
		public void read()
		{
			System.out.println("read newspaper");
		}
		public void update()
		{
			System.out.println("update newspaper");
			write();
		}
		
	}
	
	

}
