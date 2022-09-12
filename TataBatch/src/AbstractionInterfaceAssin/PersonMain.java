package AbstractionInterfaceAssin;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VP v=new VP(10,50000 , 2000, 3000, 900);
		System.out.println("Person Detail");
		v.getDetail();
		v.showDetail();
		System.out.println("Salary deatail");
		v.payTax();
	    v.empDatail();
		
		


	}

}
