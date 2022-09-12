package Inheritance;

public class BikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Pulsor p1=new Pulsor();
  p1.setBikeData(100000,"Black","60km/hr","bajaj");
  p1.setPulsorData("pulsor", 101, "Alpha");
  
  System.out.println(p1);
  p1.gears();
  p1.wheelno();
  p1.engine();
  
  
	}

}
