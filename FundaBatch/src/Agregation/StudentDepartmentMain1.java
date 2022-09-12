package Agregation;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDepartmentMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Department1 dept[]=new Department1[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id,name,student list: of the "+(i+1)+" Department: ");
			int did=sc.nextInt();
			String dname=sc.next();
			Student1 stud[]=new Student1[3];
			Department1 p=new Department1();
			p.setId(did);
			p.setName(dname);
			dept[i]=p;
			
			for(int j=0;j<3;j++)
			{
				System.out.println("enter id,name,marks,contact of the "+(j+1)+" Student: ");
				int id=sc.nextInt();
				String name=sc.next();
				int marks=sc.nextInt();
				String contact=sc.next();
				
				Student1 s1=new Student1();
				s1.setId(id);
				s1.setName(name);
				s1.setMarks(marks);
				s1.setContact(contact);
				stud[j]=s1;
				
			}
			System.out.println(Arrays.toString(dept));
			for(Department1 d:dept)
			{
			 for(Student1 s1:stud)	
			 {
				 if(s1.marks>60)
					 System.out.println(d.name+""+s1.marks);
			 }
			}
			
	}

	}
}
