package inheritancepolymorphisum;

public class Student extends Person{
	int id,percent;
	  String department;
	  void setStudentData(int id,int percent,String department)
	  {
		  this.id=id;
		  this.percent=percent;
		  this.department=department;
	  }
	 
	  void grade()
	  {
		  if(percent>90)
		  {
			  System.out.println("Garde: A");
		  }
		  else if(percent>75)
		  {
			  System.out.println("Grade: B");
		  }
		  else if(percent>55)
		  {
			  System.out.println("Grade: C");
		  }
		  else if(percent>35)
		  {
			  System.out.println("fail");
		  }
	  }
	  void display()
	  {
		  super.display();
		  System.out.println(id+" "+percent+" "+department);
	  }
}
