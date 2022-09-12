package Interface;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop s=new Shop();
		System.out.println("The Addition is: "+s.add(10,20));
		s.mul(6, 3);
		s.div(5, 7);
		s.sub(56, 10);
		s.bill(500, 300);
		
	}

}
