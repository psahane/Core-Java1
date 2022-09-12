package Wrapper;

public class EnumEx {
	enum softy
	{
		VANILA(4,78),MANGO(3,67),BUTTERSCTCH(3,40),PINAPPLE(2,56);
		int price;
		int quantity;
		softy()
		{
			
		}
		softy(int c, int q)
		{
			price=c;
			quantity=q;
			
		}
		public void getTotal()
		{
			int totalprice=price*quantity;
			System.out.println(totalprice);
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      softy s=softy.BUTTERSCTCH;
      softy s1=softy.VANILA;
      
      switch(s)
      {
      
      case VANILA: s.getTotal();
                    break;
      case MANGO: s.getTotal();
                   break;
      case BUTTERSCTCH: s.getTotal();
                          break;
      case PINAPPLE:  s.getTotal();
                         break;
    	 default:System.out.println("wrong choice ");
    		 
      
      }
     
		
	}

}
