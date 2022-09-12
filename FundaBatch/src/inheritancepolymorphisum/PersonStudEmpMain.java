package inheritancepolymorphisum;

public class PersonStudEmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.setPersonData("sahane", "1234567890", "Akole");
		s.setStudentData(10, 60, "computer");
		s.display();
		s.grade();
		System.out.println();
		Employee a = new Employee();
		a.setPersonData("sagar", "1234567890", "sangmaner");
		a.setEmployeeData(101, "soft engg", 30000);
		a.display();
		a.pf();
	}

}
