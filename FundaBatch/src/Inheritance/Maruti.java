package Inheritance;

public class Maruti extends Car {
	int id,installment;
	String modelno,paymentmode;

	void setMarutiData(int id,String modelno,String paymentmode,int installment)
	{
		this.id=id;
		this.modelno=modelno;
		this.paymentmode=paymentmode;
		this.installment=installment;
		
	}
	void display()
	{
		super.display();

		System.out.println(id+""+modelno+""+paymentmode+""+installment);
		
	}
	void Discount()
	{
		  {
			   if(paymentmode.equals("cash") && installment==0)
			    {
				int discount=price*18/100;
			
			System.out.println("Discount= "+discount);
			  }
			else if(paymentmode.equals("online") && installment==0)
			{
				int discount=price*12/100;
				
				System.out.println("Discount= "+discount);
			}
			else if(  paymentmode.equals("online")&&installment==2 ||paymentmode.equals("cash")&& installment==2  )
			{
				int discount=price*9/100;
				
				System.out.println("Discount= "+discount);
				
			}
			else 
			{
				System.out.println("no discount");
			}
		   }
	}
}
	

