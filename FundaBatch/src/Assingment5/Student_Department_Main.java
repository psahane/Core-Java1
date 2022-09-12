package Assingment5;

public class Student_Department_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
      
      Strudent s1=new Strudent(20,"kale");
      Strudent s2=new Strudent(21,"sagar");
      
      Department d1=new Department(101,"CS",s1);
      Department d2=new Department(102,"Civil",s2);
      
      
      System.out.println(d1);
      System.out.println(d2);
	}

}
