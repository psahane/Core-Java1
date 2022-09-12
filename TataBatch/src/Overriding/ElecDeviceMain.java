package Overriding;

public class ElecDeviceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElecDevice ed=new Tv();
		
		ed.doSale(5, 1000);
		
        ed =new WashingMachine();
        
		ed.doSale(2, 500);
	
		ed=new Fridge();
		ed.doSale(3, 2000);
	}

}
