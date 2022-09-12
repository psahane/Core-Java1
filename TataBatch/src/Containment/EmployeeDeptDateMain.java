package Containment;

public class EmployeeDeptDateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate m=new MyDate();
		m.setDay(7);
		m.setMonth("julai");
		m.setYear(2022);
		
		Dept d=new Dept();
		d.setDid(101);
		d.setDname("Computer");
		
		Employee e=new Employee();
		e.setId(500);
		e.setName("Pravin");
		e.setSalary(35000);
		e.setD(d);
		e.setM(m);
		
		System.out.println(e);
		
				
	}

}
