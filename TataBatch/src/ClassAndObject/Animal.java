package ClassAndObject;

public class Animal {
	
	String name,color;
	int age;
	void initObj(String n,String c,int a)
	{         
		      name=n;
	          color=c;
	          age=a;
	}
	void display()
	
	{
	          System.out.println(name+" "+color+" "+age);
	}
	public static void main(String[] args)
	{
	          Animal a1 =new Animal();
	          a1.initObj("cow","black",8);
	          a1.display();
	          
	          Animal a2 =new Animal();
	          a2.initObj("horce","white",10);
	          a2.display();

}
}
