package classandobject;

public class sport {
	int id,mark;
	String name,dept,sport;
	
	void setdata(int i,String n,String d,int m,String s )
	{
		id=i;name=n;dept=d;mark=m;sport=s;
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+mark+" "+sport);
		
	}
	void sportmark()
	
	
	{
		if(sport.equals("badmenton"))
		{
	        mark=mark+5;
	        System.out.println("new mark is:"+mark);
	         
		}
		else if(sport.equals("hocky"))
		{
	          mark=mark+8;
	          System.out.println("new mark is:"+mark);
		} 
	          
		else if(sport.equals("kho kho"))
		{
			mark=mark+2;
			System.out.println("new mark is :"+mark);
			}
		}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+mark+" "+sport;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        sport s1=new sport();
        
        
        s1.setdata(101,"pravin","comp",48,"kho kho");
       // s1.display();
        //s1.sportmark();
        System.out.println(s1);
        
        
        s1.setdata(102,"raj","entc",78,"badmenton");
       // s1.display();
        //s1.sportmark();
        System.out.println(s1);
        
        
        s1.setdata(103,"sahane","civil",95,"hocky");
      //  s1.display();
       // s1.sportmark();
        System.out.println(s1);
	}

}
