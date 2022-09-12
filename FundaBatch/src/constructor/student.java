package constructor;

public class student {
	int id,mark;
	String name;
	/*student()
	{
		id=1;
		mark=1;
		name="pravin";
		
		
	}*/
	student()
	{
		
	}
student(int id,String name,int mark)
{
	this.id=id;
	this.name=name;
	this.mark=mark;
	}
public String toString()
{
	return id+""+name+""+mark;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //student s=new student();
     // System.out.println(s);
      
      student s1=new student(101, "ram" ,50);
      System.out.println(s1);
      
    //  int id=0;
     // System.out.println(id);
      
      
	}

}
