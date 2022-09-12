import java.util.Scanner;

public class Student {

	
	int id;
	String name;
	Cource c;
	Student()
	{
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void   setName(String name)
	{
		 this.name=name;
		
	}
	public Cource getC()
	{
		return c;
		
	}
	public void  setC(Cource c)
	{
		this.c=c;
	}
	
	public String toSting()
	{
		return id+""+name+""+c;
	}
}

class Cource
{
int id ;
String name;
int fee;


 public  int getId()
{
	return id;
	}
public void setId(int id)
{
	this.id=id;
	}
public String getName()
{
	return name;
	}
public void setName(String name)
{
	this.name=name;
	}
public int  getFee()
{
	return fee;
	}
public void  setFee(int fee)
{
	this.fee=fee;
	

}
public String toString()
{
	return id+""+name+""+fee;
			}


          
           }
           
