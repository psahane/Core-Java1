package Containment;


public class StudentDepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1=new Student(20,"kale");
	      Student s2=new Student(21,"sagar");
	      
	      Department d1=new Department(101,"CS",s1);
	      Department d2=new Department(102,"Civil",s2);
	      
	      
	      System.out.println(d1);
	      System.out.println(d2);
	}

}
