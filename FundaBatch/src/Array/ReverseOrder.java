package Array;

import java.util.Scanner;

public class ReverseOrder {
	public static void main(String args[])
	   {
	     Scanner sc=new Scanner(System.in);
	      
	    int a[]=new int[10];
	     
	    System.out.print("Enter the  no=");
	    int i;
	    for(i=0;i<10;i++)
	   {
	    a[i]=sc.nextInt();
	     }
	  for( i=9;i>=0;i--)
	   {
	     
	    System.out.print(a[i]+" ");
	    }
	     
	}
	}

