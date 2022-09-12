package Array;

import java.util.Scanner;

public class Arraysearchaele {
	public static void main(String args[])
	   {
	     Scanner sc=new Scanner(System.in);
	      
	     int a[]=new int[8];
	     System.out.println("Enter 8 element =");
	      for(int i=0;i<8;i++)
	     {
	     a[i]=sc.nextInt();
	    }
	    System.out.println("Enter element search=");
	      int s=sc.nextInt();
	      int c=0;
	    for(int i=0;i<8;i++)
	   {
	     for(int j=i+1;j<8;j++)
	     if(a[i]==s)
	   {
	     c=1;
	    break;
	   }
	}
	 
	   if(c==1)
	    {
	    System.out.println(" Element is present in array");
	    }
	   else
	   {
	    System.out.println(" Element is not present in array ");
	    }
	     
	}
	}

