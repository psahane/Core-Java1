package ContainmentInheritanceAssin;

public class Employee {
	int empId,salary;
	String empName;
	
  Employee(int i,int s,String n)
  {
	  empId=i;
	  salary=s;
	  empName=n;
  }
  public void ShowDetail()
  {
	  System.out.println(" Employee Id= "+empId+" Employee Salary= "+salary+" Employee Name= "+empName);
	  System.out.println();
  }
  
  public void highestSalary(Employee e[])
  {
	  int h=e[0].salary;
	  for(int i=0;i<e.length;i++)
	  {
		  if(e[i].salary>h)
			  h=e[i].salary;
	  }
	  System.out.println("Emplloyee highest salary");
	  
	  for(int i=0;i<e.length;i++)
	  {
		  if(e[i].salary==h)
			  System.out.println(empId+""+e[i].salary+""+e[i].empName);
	  }
	  
  }
  public static void main(String[] args) {
	
	  Employee ep[]=new Employee[5];
	  ep[0]=new Employee(101,35000,"sahane");
	  ep[1]=new Employee(102,40000,"pravin ");
	  ep[2]=new Employee(103,20000,"sagar ");
	  ep[3]=new Employee(104,60000,"vaibhav ");
	  ep[4]=new Employee(105,50000,"kale");
	  System.out.println("Employee Detail  :");
	  ep[0].ShowDetail();
	  ep[1].ShowDetail();
	  ep[2].ShowDetail();
	  ep[3].ShowDetail();
	  ep[4].ShowDetail();
	  
	  
	  
	  
}
  
}
