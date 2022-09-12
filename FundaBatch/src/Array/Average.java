package Array;

import java.util.Scanner;

public class Average {
	public static void main(String args[])
	   {
	    Scanner sc=new Scanner(System.in);
	      int a[]=new int[10];

	    System.out.println("Enter the  no=");
	    int i;
	   float sum=0,avg=0;
	    for(i=0;i<9;i++)
	   {
	    a[i]=sc.nextInt();
	   }    
	   for(i=0;i<9;i++)
	     {
	     sum=sum+a[i];
	     avg=sum/10;
	      }
	     System.out.println("Average is="+avg);
	  }
	}


