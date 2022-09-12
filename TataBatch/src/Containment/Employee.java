package Containment;

public class Employee {

	int id,salary;
	String name;
	Dept d;
	MyDate m;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	public MyDate getM() {
		return m;
	}
	public void setM(MyDate m) {
		this.m = m;
	}
	
	public String toString()
	{
		return id+""+name+""+salary+""+d+""+m;
	}
	
}
