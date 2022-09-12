package Containment;


public class PersonAddressMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a=new Address();
		a.setCity("Akole");
		a.setState( "maharastra");
		a.setCountry("india");
		 
		Person p=new Person();
		p.setName("pravin" );
		p.setGender( "male" );
		p.setAge( "24" );
	    p.setA( a);
	    
		System.out.println( p);
	}

}
