package Array;

public class Employee {
	int id,salary;
	
	String location;
	String name,dept;
	 Employee()
	 {
		 
	 }
	
	 
	 public int getId() {
	 	 return id;
	 }
	 public void setId(int id)
	 {
	 	 this.id=id;
	 }

	 public String getName() 
	 {
	 	 return name;
	 }
	 public void setName(String name)
	 {
	 	 this.name=name;
	 }
	 public String getDept() {
	 	 return dept;
	 }
	 public void setDept(String dept)
	 {
	 	 this.dept=dept;
	 }
	 public int getSalary()
	 {
	 	 return salary;
	 }
	 public void setSalary(int salary)
	 {
	 	 this.salary=salary;
	 }
	 public String getLocation()
	 {
	 	 return location;
	 }
	 public void setLocatoin(String location)
	 {
	 	 this.location=location;
	 }
	 public String toString()
	 { 
	 	 return id+" "+name+" "+dept+" "+salary+" "+location;
	 			 
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
