package Array;

import java.util.Scanner;

public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student stud[]=new Student[3];
Scanner sc=new Scanner(System.in);

for(int i=0;i<3;i++)
{
	System.out.println("Enter "+(i+1)+" Student detail:");
	System.out.println("enter the id");
     int id=sc.nextInt();
     System.out.println("enter the name");
     String name=sc.next();
     System.out.println("enter the dept");
     String dept=sc.next();
     System.out.println("enter the mark");
     int mark=sc.nextInt();
 
    stud[i]=new Student(id,name,dept,mark);
 
	}
for(Student a:stud)
{
	System.out.println(a);
	}

	}

}
