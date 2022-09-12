package Assingment3;

public class Employee {
	int emp_id, salary;  
	String name;
	public int getEmp_id() {  
	    return emp_id;  
	}  
	public void setEmp_id(int emp_id) {  
	    this.emp_id = emp_id;  
	}  
	public int getSalary() {  
	    return salary;  
	}  
	public void setSalary(int salary) {  
	    this.salary = salary;  
	}  
	public String getName() {  
	    return name;  
	}  
	public void setName(String name) {  
	    this.name = name;  
	}  
	
	public String toString() {  
	    return  emp_id + " " + salary + "" + name ;  
	    }  
	      
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		    emp.setEmp_id( 101);  
	        emp.setName(" sahane"); 
	        emp.setSalary( 15000); 
	        
	    Employee emp1 = new Employee();
	        emp1.setEmp_id( 102);  
	        emp1.setName(" pravin"); 
	        emp1.setSalary( 20000); 
	        System.out.println("emp_id  Salary  Name");
	        System.out.println("**********************");
	        System.out.println(emp); 
	        System.out.println(emp1);
	}

}
