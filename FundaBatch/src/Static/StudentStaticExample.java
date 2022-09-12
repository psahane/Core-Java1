package Static;

public class StudentStaticExample {
	 int id,marks;
	   String name;
	   static String colgname="DYP";
	   StudentStaticExample(int id,String name,int marks)
	   {
		   this.id=id;
		   this.name=name;
		   this.marks=marks;
	   }
	   static
	   {
		   System.out.println("static block 1 "+colgname);
	   }
	   static
	   {
		   System.out.println("static block 2 "+colgname);
	   }
	   static void colgname()
	   {
		   System.out.println("college name is:"+colgname);
	   }
	   void display()
	   {
		   colgname="DYP";
		   System.out.println(id+" "+name+" "+marks);
		   
	   }
	   public static void main(String[] args) {
		   System.out.println("Student Details:");
		   StudentStaticExample s1= new StudentStaticExample(101,"ram",80);
		      s1.display();
		      System.out.println(StudentStaticExample.colgname);
		   
		
	}
	   
	}

