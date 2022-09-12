package Array;

import java.util.Scanner;

public class Createarray {
	

	public static void main(String args[])
	   {
	   
	   
	    Scanner x=new Scanner(System.in);
	      int a[]=new int[10];

	    System.out.println("Enter the  no=");
	    int i;
	    for(i=0;i<10;i++)
	   {
	    a[i]=x.nextInt();
	     }
	System.out.println("Inputted array is:");

	  
	  for(i=0;i<10;i++)
	{
	   System.out.print("  "+a[i]);
	    
	    }
	   }
}
