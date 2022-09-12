package Interface;

 interface I1 {
	 void Show();
	

}
 interface I2{
	 void display();
 }
 class Test implements I1,I2

 {
 	public  void Show()
 	{
 	  System.out.println("1");	
 	}
 	
 	public void display()
 	{
 		System.out.println("2");
 	}
 	
 	}
 
