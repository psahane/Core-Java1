package Abstraction;

abstract  class PaymentMode {
	
	abstract void pay();
	public void delever()
	{
		System.out.println("payment complete ");
	}
}
abstract class Card extends PaymentMode 
{
	public void pay() {
		System.out.println("payment type ");
	}
	abstract  public void payMode();
}

  class CreditCard extends Card
  
{
	  public void payMode()
	  {
		 System.out.println("using credit card ");
		 
	  }
	  }
  class Debitcard extends Card
  {
	 
	  public void payMode()
	  {
		  System.out.println("uding debit card ");
	  }
  }
  

  class AccountMain
  {
	  
	  public static void main(String[] args) {
		
		  Card c= new CreditCard();
		  c.pay();
		  c.payMode();
		  
	}
  }
	
	
		
		
	


