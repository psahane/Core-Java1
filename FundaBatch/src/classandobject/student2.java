package classandobject;

import java.util.Scanner;

public class student2 {
	
	int id,mark;
	String name,dept;
	
	void display(int id ,int mark,String name,String dept)
	
	{
		System.out.println(id+" "+mark+" "+name+" "+dept);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr the id ,mark ,name ,dept");
		int id=sc.nextInt();
		int mark=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
         student2 s= new student2();
          s.display(id,mark,name,dept);
  
	}

}
