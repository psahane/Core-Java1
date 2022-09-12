package Array;

import java.util.Scanner;

public class StudentDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student2 stud[]=new Student2[3];
   for(int i=0;i<3;i++)
   {   
	   
	   System.out.println("enter"+(i+1)+"student detail:");
		System.out.println("enter the id");
	     int id=sc.nextInt();
	     System.out.println("enter the name");
	     String name=sc.next();
	     System.out.println("enter the dept");
	     String dept=sc.next();
	     System.out.println("enter the mark");
	     String mark=sc.next();
	     Student2 s=new Student2();
	        s.setId(id);
			s.setName(name);
			s.setDept(dept);
			s.setMark(mark);
			stud[i]= s;
	     
   }
   for(Student2 a:stud)
	{
		System.out.println(a);
	}
	
   
	}

}
