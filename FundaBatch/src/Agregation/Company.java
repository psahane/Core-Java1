package Agregation;

import java.util.Arrays;

import Array.Employee;

public class Company {

	String name;
	int totalemp;
	Employee emp[];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalemp() {
		return totalemp;
	}
	public void setTotalemp(int totalemp) {
		this.totalemp = totalemp;
	}
	public Employee[] getEmp() {
		return emp;
	}
	public void setEmp(Employee[] emp) {
		this.emp = emp;
	}
	
	public String toString()
	{
	return name+""+totalemp+""+Arrays.toString(emp)	;
	}
}
