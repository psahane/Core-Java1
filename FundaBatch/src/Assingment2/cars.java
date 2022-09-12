package Assingment2;


import java.util.Scanner;

public class cars {
	 int id,year,price,installment,discount;
	  String name,brandname,pay;
	  void setData(int i,String n,int y,int p,String b,int e,String r)
	  {
		  id=i;
		  name=n;
		  year=y;
		  price=p;
		  brandname=b;
		  installment=e;
		   pay=r;
		 
	  }
	    
	  void discount()
	  {
		if(pay.equals("cash") && installment==0)
		    {
			int discount=price*18/100;
		int	amt= price-discount;
		System.out.println("After discount "+amt);
		  }
		else if(pay.equals("online") && installment==1)
		{
			int discount=price*12/100;
			int amt=price-discount;
			System.out.println("After discount "+amt);
		}
		else if(installment==2)
		{
			discount=price*9/100;
			int amt=price-discount;
			System.out.println("After discount "+amt);
			
		}
		else if(installment==3)
		{
			discount=price*5/100;
			int amt=price-discount;
			System.out.println("After discout "+amt);
		}
	  }
	   public String toString()
	   {
		   return id+" "+name+" "+year+" "+price+" "+brandname+" ";
	   }
	  public static void main(String[] args) {
		int id,year,price,installment;
		String name,brandname,pay;
	cars c1=new cars();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id,name,year,price,brandname,installment,mpay");
		id=sc.nextInt();
		name=sc.next();
		year=sc.nextInt();
		price=sc.nextInt();
		brandname=sc.next();
		installment=sc.nextInt();
		 pay=sc.next();
		

		
		  c1.setData(id, name, year, price, brandname,installment,pay);
		  
		  System.out.println(c1);
		  c1.discount();
		  
	  }  
		  
		  
	}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	


