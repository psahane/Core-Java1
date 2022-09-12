package GetterSetter;

import java.util.Scanner;
public class Student {
int id;
String name,dept,city,contact;
double percentage;
char grade ;


Student()
{
	}
public int getId() {
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
public String getDept() {
	 return dept;
}
public void setDept(String dept)
{
	 this.dept=dept;
}
public String getCity()
{
	 return city;
}
public void setCity(String city)
{
	 this.city=city;
}
public double getPercentage() {
	 return percentage;
}
public void setMarks(double percentage)
{
	 this.percentage=percentage;
}
public String getContact() {
	 return contact;
}
public void setContact(String contact)
{
	 this.contact=contact;
}
public String toString()
{
	 return id+" "+name+" "+percentage+" "+dept+" "+city+" "+contact;
			 
}


void percentage()

{
	 if(percentage>=80 )
	 {
		 System.out.println("Grade A");
	 }
	 else if(percentage>=60 )
	 {
		 System.out.println("Grade B");
	 }
	 else if (percentage>=50)
	 {
		 System.out.println("Grade C");
	 }
}
public static void main(String[] args) {
	
	   Student s1=new Student();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter Details of Student");
	   System.out.println("id,name,dept,marks,city,contact");
	   int id=sc.nextInt();
	   String name=sc.next();
	   String dept=sc.next();
	   String marks=sc.next();
	   String city=sc.next();
	   String contact=sc.next();
	   
	     System.out.println(s1);
	     s1.percentage();
	   
}

}