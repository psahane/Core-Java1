package Practice;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]=new int[10];
    Scanner sc=new Scanner(System.in);
   System.out.println("enter the array element");
   for(int i=0;i<10;i++)
   {
	   a[i]=sc.nextInt();
   }
   for(int i=0;i<a.length;i++)
   {
	 boolean  prime =true;
	   for(int j=2;j<a[i];j++)
	   {
		   if(a[i]%j==0)
		   {
			  prime= false;
			 break;
		   }
	   }
	   if(prime==true )
	   {
		   System.out.println("prime no is :"+a[i]);  
	   }
		   
	   
	   
   }
   
	}

}
