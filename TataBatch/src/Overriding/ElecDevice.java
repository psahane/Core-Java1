package Overriding;

public class ElecDevice {

	int quantiy;
	float itemPrice;
	
	protected void doSale(int qty,float ip)
	{
		this.quantiy=qty;
		this.itemPrice=ip;
		
	System.out.println("sale Amount"+(qty*ip));
	}
}
class Tv extends ElecDevice
{
  protected void doSale(int qty,float ip)
   
   {
	super.doSale(qty,ip); 
//     this.quantiy=qty;
//     this.itemPrice=ip;
//	 System.out.println("sale Amount"+(qty*ip));
//	  
   }
   
}
class WashingMachine extends ElecDevice
{
  	
	protected void doSale(int qty,float ip)
	   
	   {
		super.doSale(qty, ip);
//		  this.quantiy=qty;
//		  this.itemPrice=ip;
//		  System.out.println("Sale Amount "+(qty*ip));
		  
	   }
}
class Fridge extends ElecDevice
{
	protected void doSale(int qty,float ip)
	   
	   {
		  this.quantiy=qty;
		  this.itemPrice=ip;
		  System.out.println("Sale Amount "+(qty*ip));
		  
	   }
	
}