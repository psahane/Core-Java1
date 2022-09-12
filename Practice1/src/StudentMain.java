import java.util.Scanner;

public class StudentMain {

	 public static void main(String[] args)
     {
  	   Scanner sc=new Scanner(System.in);
  	   System.out.println("enterr the id,name,cource detail");
  	   int id=sc.nextInt();
  	  String name=sc.next();
  	  String cource=sc.next();
  	  
  	   Student s=new Student();
  	  
  	  s.getId();
  	  s.getName();
  	  s.getC();
  	System.out.println(s);
  	   }
}
