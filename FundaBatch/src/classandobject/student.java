package classandobject;

public class student {
	int id,mark;
	String name,dept;
	
	void setdata(int i,String n,String d,int m )
	{
		id=i;name=n;dept=d;mark=m;
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+mark);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student();
student s2=new student();


s1.setdata(101,"raj","comp",70);
s1.display();
s2.setdata(102,"pravin","css",71);
s2.display();


	}

}
