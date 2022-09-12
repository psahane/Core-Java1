package Array;

import java.util.Scanner;

public class ArrayCheckno {
	public static void main(String args[])
	 {
	   Scanner x=new Scanner(System.in);
	    int a[]=new int[10];
	    System.out.println("Enter 10 no=");  
	     int z=0,n=0,p=0,s=0,c=0;
	     int i;
	      for( i=0;i<10;i++)     
	      a[i]=x.nextInt();
	    
	      for(i=0;i<10;i++)
	      if(a[i]>=0)
	      p++;
	       System.out.println("Number is Positive=" +p);
	     for(i=0;i<10;i++)
	      if(a[i]<0)
	      n++;
	       System.out.println("Number is negative=" +n);
	       for(i=0;i<10;i++)
	       
	       if(a[i]%2==0)
	    	   s++;
	       System.out.println("Number is even=" +s);
	       
	       for(i=0;i<10;i++)
	       
	       if(a[i]%2!=0)
	    	   c++;
	       
	       System.out.println("Number is odd=" +c);

		    for(i=0;i<10;i++)
		    
		    if(a[i]==0)
		      z++;
		      System.out.println("Number is zero=" +z);    
	      }
	      }
	 


