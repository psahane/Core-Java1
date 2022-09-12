package ContainmentInheritanceAssin;

public class LaptopOperatingSystemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperatingSystem o=new OperatingSystem( "windows 10","kale",11.0);
		
		Laptop l=new Laptop("Dell",35000,o);
		System.out.println(l);
	}

}
