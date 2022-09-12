package inheritancepolymorphisum;

public class Drivercarmain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		Driver d1=new Driver(101 ," sagar ","123456789");
		Driver d2=new Driver(102 ," vk ","123456789");
		
		car c1=new car(1 ," swift "," maruti ",d1);
		car c2=new car(2 ," alto "," maruti ",d2);
		
		
		System.out.println(c1);
		System.out.println(c2);
		
	}
	

}
